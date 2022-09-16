package defpackage;
/* compiled from: PG */
/* renamed from: akwi  reason: default package */
/* loaded from: classes.dex */
public enum akwi {
    ANR("anr_detection.journal", "anr_journals"),
    JAVA_CRASH("javacrash_detection.journal", "javacrash_journals"),
    NATIVE_CRASH("nativecrash_detection.journal", "nativecrash_journals");
    
    public final String d;
    public final String e;

    akwi(String str, String str2) {
        this.d = str;
        this.e = str2;
    }
}
