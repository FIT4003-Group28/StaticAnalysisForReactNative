package ezvcard;

import com.google.android.gms.common.internal.ImagesContract;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class VCardDataType {
    private final String q;
    private static final ezvcard.util.a<VCardDataType, String> p = new ezvcard.util.a<VCardDataType, String>(VCardDataType.class) { // from class: ezvcard.VCardDataType.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        public VCardDataType a(String str) {
            return new VCardDataType(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        public boolean a(VCardDataType vCardDataType, String str) {
            return vCardDataType.q.equalsIgnoreCase(str);
        }
    };
    @c(a = {VCardVersion.V2_1})

    /* renamed from: a  reason: collision with root package name */
    public static final VCardDataType f5458a = new VCardDataType(ImagesContract.URL);
    @c(a = {VCardVersion.V2_1})

    /* renamed from: b  reason: collision with root package name */
    public static final VCardDataType f5459b = new VCardDataType("content-id");
    @c(a = {VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final VCardDataType f5460c = new VCardDataType("binary");
    @c(a = {VCardVersion.V3_0, VCardVersion.V4_0})

    /* renamed from: d  reason: collision with root package name */
    public static final VCardDataType f5461d = new VCardDataType("uri");
    public static final VCardDataType e = new VCardDataType(TextBundle.TEXT_ENTRY);
    @c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType f = new VCardDataType("date");
    @c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType g = new VCardDataType("time");
    @c(a = {VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType h = new VCardDataType("date-time");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType i = new VCardDataType("date-and-or-time");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType j = new VCardDataType("timestamp");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType k = new VCardDataType("boolean");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType l = new VCardDataType("integer");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType m = new VCardDataType("float");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType n = new VCardDataType("utc-offset");
    @c(a = {VCardVersion.V4_0})
    public static final VCardDataType o = new VCardDataType("language-tag");

    private VCardDataType(String str) {
        this.q = str;
    }

    public String a() {
        return this.q;
    }

    public VCardVersion[] b() {
        Field[] fields;
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        c cVar = (c) field.getAnnotation(c.class);
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
        for (VCardVersion vCardVersion2 : b()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.q;
    }

    public static VCardDataType a(String str) {
        return p.b(str);
    }

    public static VCardDataType b(String str) {
        return p.c(str);
    }

    public static Collection<VCardDataType> c() {
        return p.a();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
