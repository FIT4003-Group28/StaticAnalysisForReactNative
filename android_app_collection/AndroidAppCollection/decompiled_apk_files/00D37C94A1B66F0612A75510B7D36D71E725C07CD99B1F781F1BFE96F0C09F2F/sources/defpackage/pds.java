package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: pds  reason: default package */
/* loaded from: classes4.dex */
public final class pds extends IOException implements afma {
    private final String a;

    public pds(String str, Exception exc) {
        super(str, exc);
        this.a = "file";
    }

    @Override // defpackage.afma
    public final String a(boolean z) {
        return this.a;
    }

    @Override // defpackage.afma
    public final String b() {
        return getMessage();
    }
}
