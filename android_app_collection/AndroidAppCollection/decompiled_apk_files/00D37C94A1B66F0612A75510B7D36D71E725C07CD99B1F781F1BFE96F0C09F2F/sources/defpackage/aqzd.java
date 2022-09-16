package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aqzd  reason: default package */
/* loaded from: classes2.dex */
public final class aqzd implements aajq {
    public static final aajr a = new aqzc();
    public final aqzf b;

    public aqzd(aqzf aqzfVar) {
        this.b = aqzfVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
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
        return new aqzb(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqzd) && this.b.equals(((aqzd) obj).b);
    }

    public String getCurrentStepId() {
        return this.b.d;
    }

    public Map getNextStepIdOverrideMap() {
        return Collections.unmodifiableMap(this.b.f);
    }

    public List getStepIdStack() {
        return this.b.e;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("FlowStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
