package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyxr  reason: default package */
/* loaded from: classes6.dex */
final class dyxr implements InvocationHandler {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public String b;
    private final List<String> d;

    public dyxr(List<String> list) {
        this.d = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = dyxv.a;
        }
        if (!name.equals("supports") || Boolean.TYPE != returnType) {
            if (!name.equals("unsupported") || Void.TYPE != returnType) {
                if (!name.equals("protocols") || objArr.length != 0) {
                    if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof List) {
                            List list = (List) obj2;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                if (this.d.contains(list.get(i))) {
                                    String str = (String) list.get(i);
                                    this.b = str;
                                    return str;
                                }
                            }
                            String str2 = this.d.get(0);
                            this.b = str2;
                            return str2;
                        }
                    }
                    if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                        return method.invoke(this, objArr);
                    }
                    this.b = (String) objArr[0];
                    return null;
                }
                return this.d;
            }
            this.a = true;
            return null;
        }
        return true;
    }
}
