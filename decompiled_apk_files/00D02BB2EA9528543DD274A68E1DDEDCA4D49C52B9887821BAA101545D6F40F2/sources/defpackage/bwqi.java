package defpackage;
/* compiled from: PG */
/* renamed from: bwqi  reason: default package */
/* loaded from: classes4.dex */
public enum bwqi implements bwrl {
    BUNDLED("bundled"),
    URI("uri");
    
    public final String c;

    bwqi(String str) {
        this.c = str;
    }

    @Override // defpackage.bwrl
    public final String a() {
        return this.c;
    }
}
