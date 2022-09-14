package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.property.TextProperty;
/* compiled from: StringPropertyScribe.java */
/* loaded from: classes.dex */
public abstract class ay<T extends TextProperty> extends at<T> {
    public ay(Class<T> cls, String str) {
        this(cls, str, VCardDataType.e);
    }

    public ay(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str, vCardDataType);
    }
}
