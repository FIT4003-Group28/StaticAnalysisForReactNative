package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public class VCardParameter {
    protected final String u;

    public VCardParameter(String str) {
        this(str, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VCardParameter(String str, boolean z) {
        if (str != null && !z) {
            str = str.toLowerCase();
        }
        this.u = str;
    }

    public String c() {
        return this.u;
    }

    public VCardVersion[] d() {
        Field[] fields;
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        ezvcard.c cVar = (ezvcard.c) field.getAnnotation(ezvcard.c.class);
                        return cVar == null ? VCardVersion.values() : cVar.a();
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return VCardVersion.values();
    }

    public boolean a(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : d()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.u;
    }

    public int hashCode() {
        return 31 + (this.u == null ? 0 : this.u.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardParameter vCardParameter = (VCardParameter) obj;
        if (this.u == null) {
            if (vCardParameter.u != null) {
                return false;
            }
        } else if (!this.u.equals(vCardParameter.u)) {
            return false;
        }
        return true;
    }
}
