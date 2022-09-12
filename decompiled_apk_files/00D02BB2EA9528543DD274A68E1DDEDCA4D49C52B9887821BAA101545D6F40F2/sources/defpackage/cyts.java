package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: cyts  reason: default package */
/* loaded from: classes5.dex */
public final class cyts {
    public final dbsg<Integer> a;
    public final dcdc<cywm> b;
    public final dbsg<Long> c;
    public final cyes d;
    public final cyer e;
    @dzsi
    private final AutocompletionCallbackMetadata f;

    public cyts(@dzsi Integer num, dcdc<cywm> dcdcVar, @dzsi Long l, @dzsi AutocompletionCallbackMetadata autocompletionCallbackMetadata, cyes cyesVar, cyer cyerVar) {
        this.a = dbsg.j(num);
        this.b = dcdcVar;
        this.c = dbsg.j(l);
        this.f = autocompletionCallbackMetadata;
        this.d = cyesVar;
        this.e = cyerVar;
    }

    public static cytr c() {
        return new cytr();
    }

    public final dbsg<AutocompletionCallbackMetadata> a() {
        return dbsg.j(this.f);
    }

    public final cytr b() {
        cytr c = c();
        c.a = this.a.f();
        c.b(this.b);
        c.c = this.c.f();
        c.d = this.f;
        c.e = this.d;
        c.f = this.e;
        return c;
    }
}
