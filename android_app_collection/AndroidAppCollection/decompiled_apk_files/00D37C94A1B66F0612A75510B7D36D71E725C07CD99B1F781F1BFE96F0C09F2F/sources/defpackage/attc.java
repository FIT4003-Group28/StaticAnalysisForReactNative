package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: attc  reason: default package */
/* loaded from: classes2.dex */
public final class attc implements aajq {
    public static final aajr a = new attb();
    private final attd b;

    public attc(attd attdVar) {
        this.b = attdVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amzt listIterator = ((amuk) getStreamsProgressModels()).listIterator();
        while (listIterator.hasNext()) {
            auzx auzxVar = (auzx) listIterator.next();
            amvlVar.j(auzx.b());
        }
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new atta(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof attc) && this.b.equals(((attc) obj).b);
    }

    public List getStreamsProgress() {
        return this.b.d;
    }

    public List getStreamsProgressModels() {
        amuf amufVar = new amuf();
        for (auzy auzyVar : this.b.d) {
            amufVar.h(auzx.a(auzyVar).a());
        }
        return amufVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("OfflineVideoStreamsEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
