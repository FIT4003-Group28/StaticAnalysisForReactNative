package ezvcard.parameter;

import ezvcard.parameter.MediaTypeParameter;
import java.lang.reflect.Constructor;
/* compiled from: MediaTypeCaseClasses.java */
/* loaded from: classes.dex */
public class b<T extends MediaTypeParameter> extends ezvcard.util.a<T, String[]> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ezvcard.util.a
    protected /* bridge */ /* synthetic */ boolean a(Object obj, String[] strArr) {
        return a((b<T>) ((MediaTypeParameter) obj), strArr);
    }

    public b(Class<T> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.util.a
    public T a(String[] strArr) {
        try {
            Constructor declaredConstructor = this.f5598a.getDeclaredConstructor(String.class, String.class, String.class);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected boolean a(T t, String[] strArr) {
        String[] strArr2 = {t.c(), t.a(), t.b()};
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null && !str.equalsIgnoreCase(strArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
