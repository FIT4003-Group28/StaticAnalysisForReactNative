package defpackage;

import java.nio.channels.Channels;
/* compiled from: PG */
/* renamed from: bafi  reason: default package */
/* loaded from: classes2.dex */
final class bafi implements bage {
    final /* synthetic */ bafk a;

    public bafi(bafk bafkVar) {
        this.a = bafkVar;
    }

    @Override // defpackage.bage
    public final void a() {
        bafk bafkVar = this.a;
        if (bafkVar.g == null) {
            bafkVar.i.l = 10;
            bafkVar.f.setDoOutput(true);
            bafkVar.f.connect();
            bafkVar.i.l = 12;
            bafkVar.h = bafkVar.f.getOutputStream();
            bafkVar.g = Channels.newChannel(bafkVar.h);
        }
        this.a.a.set(0);
        this.a.a(new bafh(this));
    }
}
