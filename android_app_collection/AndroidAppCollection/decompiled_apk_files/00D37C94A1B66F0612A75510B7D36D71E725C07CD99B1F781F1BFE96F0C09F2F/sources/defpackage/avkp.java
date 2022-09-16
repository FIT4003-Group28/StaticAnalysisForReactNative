package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: avkp  reason: default package */
/* loaded from: classes2.dex */
public final class avkp implements aajq {
    public static final aajr a = new avko();
    public final aajl b;
    public final avkq c;

    public avkp(avkq avkqVar, aajl aajlVar) {
        this.c = avkqVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        if (this.c.h.size() > 0) {
            amvlVar.j(this.c.h);
        }
        if (this.c.m.size() > 0) {
            amvlVar.j(this.c.m);
        }
        amzt listIterator = ((amuk) getStreamProgressModels()).listIterator();
        while (listIterator.hasNext()) {
            auzx auzxVar = (auzx) listIterator.next();
            amvlVar.j(auzx.b());
        }
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final avkn e() {
        return new avkn(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avkp) && this.c.equals(((avkp) obj).c);
    }

    public String getCotn() {
        return this.c.i;
    }

    public Long getEnqueuedTimestampMs() {
        return Long.valueOf(this.c.j);
    }

    public avkm getFailureReason() {
        avkm b = avkm.b(this.c.g);
        return b == null ? avkm.TRANSFER_FAILURE_REASON_UNKNOWN : b;
    }

    public Boolean getIsRefresh() {
        return Boolean.valueOf(this.c.o);
    }

    public attl getMaximumDownloadQuality() {
        attl b = attl.b(this.c.k);
        return b == null ? attl.UNKNOWN_FORMAT_TYPE : b;
    }

    public String getPreferredAudioTrack() {
        return this.c.l;
    }

    public List getStreamProgress() {
        return this.c.f;
    }

    public List getStreamProgressModels() {
        amuf amufVar = new amuf();
        for (auzy auzyVar : this.c.f) {
            amufVar.h(auzx.a(auzyVar).a());
        }
        return amufVar.g();
    }

    public Integer getTransferRetryCount() {
        return Integer.valueOf(this.c.n);
    }

    public avkl getTransferState() {
        avkl b = avkl.b(this.c.e);
        return b == null ? avkl.TRANSFER_STATE_UNKNOWN : b;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("TransferEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
