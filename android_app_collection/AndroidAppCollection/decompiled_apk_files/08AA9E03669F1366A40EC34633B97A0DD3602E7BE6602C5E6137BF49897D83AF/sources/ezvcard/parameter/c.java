package ezvcard.parameter;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameter;
import java.lang.reflect.Constructor;
/* compiled from: VCardParameterCaseClasses.java */
/* loaded from: classes.dex */
public class c<T extends VCardParameter> extends ezvcard.util.a<T, String> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ezvcard.util.a
    protected /* bridge */ /* synthetic */ boolean a(Object obj, String str) {
        return a((c<T>) ((VCardParameter) obj), str);
    }

    public c(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    public T a(String str) {
        try {
            try {
                Constructor declaredConstructor = this.f5598a.getDeclaredConstructor(String.class);
                declaredConstructor.setAccessible(true);
                return (T) declaredConstructor.newInstance(str);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception unused) {
            Constructor declaredConstructor2 = this.f5598a.getDeclaredConstructor(String.class, VCardVersion[].class);
            declaredConstructor2.setAccessible(true);
            return (T) declaredConstructor2.newInstance(str, new VCardVersion[0]);
        }
    }

    protected boolean a(T t, String str) {
        return t.c().equalsIgnoreCase(str);
    }
}
