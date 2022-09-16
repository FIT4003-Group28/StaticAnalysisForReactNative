package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acyj  reason: default package */
/* loaded from: classes.dex */
public final class acyj implements adwb {
    final /* synthetic */ adwb a;
    final /* synthetic */ acyo b;

    public acyj(acyo acyoVar, adwb adwbVar) {
        this.b = acyoVar;
        this.a = adwbVar;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        this.a.a(iOException);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        if (yrbVar.a == 200) {
            this.b.k++;
        }
        this.a.i(yrbVar);
    }
}
