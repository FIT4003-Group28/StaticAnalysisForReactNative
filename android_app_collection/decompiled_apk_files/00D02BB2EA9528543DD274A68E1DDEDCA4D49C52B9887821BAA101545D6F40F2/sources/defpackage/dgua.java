package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: dgua  reason: default package */
/* loaded from: classes6.dex */
final class dgua implements dguw {
    final /* synthetic */ Class a;
    final /* synthetic */ Type b;
    private final dgvd c;

    public dgua(Class cls, Type type) {
        dgvd dgvcVar;
        this.a = cls;
        this.b = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            dgvcVar = new dguz(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    dgvcVar = new dgva(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    dgvcVar = new dgvb(declaredMethod3);
                }
            } catch (Exception unused3) {
                dgvcVar = new dgvc();
            }
        }
        this.c = dgvcVar;
    }

    @Override // defpackage.dguw
    public final Object a() {
        try {
            return this.c.a(this.a);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.b + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }
}
