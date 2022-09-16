package defpackage;
/* compiled from: PG */
/* renamed from: eamo  reason: default package */
/* loaded from: classes6.dex */
public enum eamo {
    UTF8("UTF-8", false),
    UTF16_BE("UTF-16BE", true),
    UTF16_LE("UTF-16LE", false),
    UTF32_BE("UTF-32BE", true),
    UTF32_LE("UTF-32LE", false);
    
    public final String f;
    public final boolean g;

    eamo(String str, boolean z) {
        this.f = str;
        this.g = z;
    }
}
