package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: civ  reason: default package */
/* loaded from: classes2.dex */
public final class civ implements cim {
    private final clb a;

    public civ(clb clbVar) {
        this.a = clbVar;
    }

    @Override // defpackage.cim
    public final /* bridge */ /* synthetic */ cin a(Object obj) {
        return new ciw((InputStream) obj, this.a);
    }

    @Override // defpackage.cim
    public final Class b() {
        return InputStream.class;
    }
}
