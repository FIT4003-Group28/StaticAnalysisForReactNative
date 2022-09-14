package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
/* compiled from: SimplePropertyScribe.java */
/* loaded from: classes.dex */
public abstract class at<T extends VCardProperty> extends bg<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final VCardDataType f5480a;

    protected abstract T b(String str);

    public at(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str);
        this.f5480a = vCardDataType;
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return this.f5480a;
    }

    @Override // ezvcard.a.b.bg
    protected T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return b(com.b.a.a.b.e.a(str));
    }
}
