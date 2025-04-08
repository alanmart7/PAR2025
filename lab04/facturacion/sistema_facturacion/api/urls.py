from django.urls import path, include
from rest_framework.routers import DefaultRouter
from .views import ClienteList, ClienteDetail, ProductoList, ProductoDetail,FacturaList, FacturaDetail

'''
from .views import ClienteViewSet, ProductoViewSet, FacturaViewSet,
router = DefaultRouter()
router.register(r'clientes', ClienteViewSet)
router.register(r'productos', ProductoViewSet)
router.register(r'facturas', FacturaViewSet)
#router.register(r'proveedores', ProveedorViewSet)
#router.register(r'reportes', ReporteViewSet)
'''

urlpatterns = [
   # path('', include(router.urls)),
    # Clientes
    path('clientes/', ClienteList.as_view(), name='cliente-list'),
    path('clientes/<int:pk>/', ClienteDetail.as_view(), name='cliente-detail'),

    # Productos
    path('productos/', ProductoList.as_view(), name='producto-list'),
    path('productos/<int:pk>/', ProductoDetail.as_view(), name='producto-detail'),

    # Facturas
    path('facturas/', FacturaList.as_view(), name='factura-list'),
    path('facturas/<int:pk>/', FacturaDetail.as_view(), name='factura-detail'),
]
