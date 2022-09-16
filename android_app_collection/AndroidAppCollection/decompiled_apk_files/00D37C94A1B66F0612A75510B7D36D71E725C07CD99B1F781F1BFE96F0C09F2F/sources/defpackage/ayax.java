package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: ayax  reason: default package */
/* loaded from: classes2.dex */
public final class ayax {
    public final ayaw a;
    public final String b;
    public final String c;
    public final ayav d;
    private final ayav e;
    private final boolean f;

    public ayax(ayaw ayawVar, String str, ayav ayavVar, ayav ayavVar2, boolean z) {
        new AtomicReferenceArray(2);
        ayawVar.getClass();
        this.a = ayawVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        ayavVar.getClass();
        this.e = ayavVar;
        ayavVar2.getClass();
        this.d = ayavVar2;
        this.f = z;
    }

    public static ayau a() {
        ayau ayauVar = new ayau();
        ayauVar.a = null;
        ayauVar.b = null;
        return ayauVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream b(Object obj) {
        return new aymu(obj, ((aymv) this.e).b);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("fullMethodName", this.b);
        c.b("type", this.a);
        c.g("idempotent", false);
        c.g("safe", false);
        c.g("sampledToLocalTracing", this.f);
        c.b("requestMarshaller", this.e);
        c.b("responseMarshaller", this.d);
        c.b("schemaDescriptor", null);
        c.a = true;
        return c.toString();
    }
}
