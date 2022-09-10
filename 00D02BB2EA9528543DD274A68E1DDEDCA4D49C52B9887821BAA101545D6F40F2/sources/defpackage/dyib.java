package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: dyib  reason: default package */
/* loaded from: classes6.dex */
public final class dyib<ReqT, RespT> {
    public final dyhz a;
    public final String b;
    @dzsi
    public final String c;
    public final dyhy<ReqT> d;
    public final dyhy<RespT> e;
    public final boolean f;

    public dyib(dyhz dyhzVar, String str, dyhy<ReqT> dyhyVar, dyhy<RespT> dyhyVar2, boolean z) {
        new AtomicReferenceArray(2);
        dbsk.t(dyhzVar, "type");
        this.a = dyhzVar;
        dbsk.t(str, "fullMethodName");
        this.b = str;
        dbsk.t(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        dbsk.t(dyhyVar, "requestMarshaller");
        this.d = dyhyVar;
        dbsk.t(dyhyVar2, "responseMarshaller");
        this.e = dyhyVar2;
        this.f = z;
    }

    public static String b(String str, String str2) {
        dbsk.t(str, "fullServiceName");
        dbsk.t(str2, "methodName");
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    public static <ReqT, RespT> dyhx<ReqT, RespT> c() {
        dyhx<ReqT, RespT> dyhxVar = new dyhx<>();
        dyhxVar.a = null;
        dyhxVar.b = null;
        return dyhxVar;
    }

    public final InputStream a(ReqT reqt) {
        return new dyyn((dssj) reqt, ((dyyo) this.d).a);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("fullMethodName", this.b);
        b.b("type", this.a);
        b.h("idempotent", false);
        b.h("safe", false);
        b.h("sampledToLocalTracing", this.f);
        b.b("requestMarshaller", this.d);
        b.b("responseMarshaller", this.e);
        b.b("schemaDescriptor", null);
        b.c();
        return b.toString();
    }
}
