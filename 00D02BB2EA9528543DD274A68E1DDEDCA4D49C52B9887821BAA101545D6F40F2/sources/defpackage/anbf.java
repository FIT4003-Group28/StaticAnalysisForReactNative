package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anbf  reason: default package */
/* loaded from: classes2.dex */
public final class anbf implements akuc {
    final /* synthetic */ anbg a;

    public anbf(anbg anbgVar) {
        this.a = anbgVar;
    }

    @Override // defpackage.akuc
    public final /* bridge */ /* synthetic */ Collection a() {
        return this.a.c;
    }

    @Override // defpackage.akuc
    @dzsi
    public final akud b(dmpn dmpnVar) {
        akud akudVar = this.a.b;
        return (akudVar == null || !dmpnVar.equals(((akst) akudVar).a)) ? this.a.a.g.b(dmpnVar) : this.a.b;
    }

    @Override // defpackage.akuc
    public final int c() {
        return ((amjh) this.a.a.g).a;
    }
}
