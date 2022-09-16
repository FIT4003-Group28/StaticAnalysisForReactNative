package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.TextListProperty;
import java.util.List;
/* compiled from: ListPropertyScribe.java */
/* loaded from: classes.dex */
public abstract class ac<T extends TextListProperty> extends bg<T> {
    protected abstract T b();

    public ac(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(com.b.a.a.b.e.b(str));
    }

    private T a(List<String> list) {
        T b2 = b();
        b2.getValues().addAll(list);
        return b2;
    }
}
