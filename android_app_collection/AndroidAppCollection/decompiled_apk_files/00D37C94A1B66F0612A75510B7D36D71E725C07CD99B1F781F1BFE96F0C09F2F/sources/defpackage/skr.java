package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: skr  reason: default package */
/* loaded from: classes4.dex */
public final class skr {
    public final skv a;
    public final Executor b;
    public final Executor c;
    public final CronetEngine d;
    public final shr e;
    private final Executor f;

    public skr(shr shrVar, skv skvVar, Executor executor, Executor executor2, Executor executor3, CronetEngine cronetEngine) {
        if (shrVar != null) {
            this.e = shrVar;
            this.a = skvVar;
            if (executor != null) {
                this.f = executor;
                if (executor2 != null) {
                    this.b = executor2;
                    if (executor3 != null) {
                        this.c = executor3;
                        if (cronetEngine != null) {
                            this.d = cronetEngine;
                            return;
                        }
                        throw new NullPointerException("Null cronetEngine");
                    }
                    throw new NullPointerException("Null lightweightExecutor");
                }
                throw new NullPointerException("Null backgroundExecutor");
            }
            throw new NullPointerException("Null mainExecutor");
        }
        throw new NullPointerException("Null API");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skr) {
            skr skrVar = (skr) obj;
            if (this.e.equals(skrVar.e) && this.a.equals(skrVar.a) && this.f.equals(skrVar.f) && this.b.equals(skrVar.b) && this.c.equals(skrVar.c) && this.d.equals(skrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("FaceViewerContext{API=");
        sb.append(valueOf);
        sb.append(", model=");
        sb.append(valueOf2);
        sb.append(", mainExecutor=");
        sb.append(valueOf3);
        sb.append(", backgroundExecutor=");
        sb.append(valueOf4);
        sb.append(", lightweightExecutor=");
        sb.append(valueOf5);
        sb.append(", cronetEngine=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public skr() {
    }
}
