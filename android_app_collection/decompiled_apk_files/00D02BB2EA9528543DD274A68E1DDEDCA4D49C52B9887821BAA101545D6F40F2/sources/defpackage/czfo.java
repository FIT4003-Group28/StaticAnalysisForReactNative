package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: czfo  reason: default package */
/* loaded from: classes5.dex */
public abstract class czfo {
    static {
        czfn i = i();
        i.g(cyes.FAILED_UNKNOWN);
        i.a();
    }

    public static czfn i() {
        czfb czfbVar = new czfb();
        czfbVar.d(false);
        czfbVar.c(AutocompletionCallbackMetadata.e().a());
        czfbVar.b(AffinityContext.b);
        czfbVar.f(dcdc.e());
        czfbVar.e(dcdc.e());
        dcdc<cywm> e = dcdc.e();
        if (e != null) {
            czfbVar.a = e;
            return czfbVar;
        }
        throw new NullPointerException("Null peopleStackItems");
    }

    public abstract AffinityContext a();

    public abstract dcdc<cyxj> b();

    public abstract dcdc<cywi> c();

    public abstract dcdc<cywm> d();

    public abstract cyes e();

    @dzsi
    public abstract Long f();

    public abstract AutocompletionCallbackMetadata g();

    public abstract boolean h();
}
