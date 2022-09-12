package defpackage;
/* compiled from: PG */
/* renamed from: cdxf  reason: default package */
/* loaded from: classes4.dex */
final class cdxf {
    public final boolean a;
    public final boolean b;

    public cdxf(cdxe cdxeVar, cdxe cdxeVar2, boolean z) {
        this.a = cdxeVar.b() != cdxeVar2.b() || z;
        this.b = !cdxeVar.c().equals(cdxeVar2.c());
    }
}
