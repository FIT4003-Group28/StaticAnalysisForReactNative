package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpoh  reason: default package */
/* loaded from: classes5.dex */
public final class cpoh implements cpox {
    final /* synthetic */ cpoj a;

    public cpoh(cpoj cpojVar) {
        this.a = cpojVar;
    }

    @Override // defpackage.cpox
    public final int a() {
        return 100;
    }

    @Override // defpackage.cpox
    public final String b() {
        ArrayList a = cpwi.a();
        for (cpot cpotVar : this.a.s) {
            a.add(new cpog(cpotVar));
        }
        return this.a.m.a(a);
    }
}
