package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: adto  reason: default package */
/* loaded from: classes.dex */
public final class adto implements adst {
    public static final String a = zep.a("MDX.transport");
    public final adtt b;
    public int c = 0;
    public final Object d = new Object();
    private final Executor e;
    private final yni f;
    private final acvh g;
    private final adts h;

    public adto(adtt adttVar, Executor executor, yni yniVar, acvh acvhVar) {
        adtn adtnVar = new adtn(this);
        this.h = adtnVar;
        adttVar.getClass();
        this.b = adttVar;
        this.e = executor;
        this.f = yniVar;
        adttVar.c(adtnVar);
        acvhVar.getClass();
        this.g = acvhVar;
    }

    @Override // defpackage.adst
    public final int a() {
        int i;
        synchronized (this.d) {
            i = this.c;
        }
        return i;
    }

    @Override // defpackage.adst
    public final void b(adss adssVar) {
        adti adtiVar = this.b.b;
        adtiVar.a = adssVar;
        Object poll = adtiVar.b.poll();
        while (true) {
            adtd adtdVar = (adtd) poll;
            if (adtdVar == null) {
                break;
            }
            try {
                String.format("Processing queued messages: %s", adtdVar);
                adtiVar.a.b(adtdVar);
            } catch (JSONException unused) {
                zep.c("MDX.transport", String.format("Could not process queued message: %s", adtdVar));
            }
            poll = adtiVar.b.poll();
        }
        synchronized (this.d) {
            if (this.c == 0) {
                this.c = 1;
            }
        }
    }

    @Override // defpackage.adst
    public final void d() {
    }

    @Override // defpackage.adst
    public final void e(final adil adilVar, final adip adipVar) {
        this.f.d(new adag(adilVar, "local_ws"));
        this.g.q(asny.LATENCY_ACTION_MDX_COMMAND);
        this.g.t("mdx_cs", asny.LATENCY_ACTION_MDX_COMMAND);
        acvh acvhVar = this.g;
        asny asnyVar = asny.LATENCY_ACTION_MDX_COMMAND;
        aopa createBuilder = asno.a.createBuilder();
        aopa createBuilder2 = asnt.a.createBuilder();
        createBuilder2.copyOnWrite();
        asnt asntVar = (asnt) createBuilder2.instance;
        asntVar.e = 3;
        asntVar.b |= 4;
        String str = adilVar.al;
        createBuilder2.copyOnWrite();
        asnt asntVar2 = (asnt) createBuilder2.instance;
        str.getClass();
        asntVar2.b |= 1;
        asntVar2.c = str;
        asnt asntVar3 = (asnt) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asntVar3.getClass();
        asnoVar.w = asntVar3;
        asnoVar.c |= 1048576;
        acvhVar.n(asnyVar, (asno) createBuilder.mo39build());
        this.e.execute(new Runnable() { // from class: adtm
            @Override // java.lang.Runnable
            public final void run() {
                adto adtoVar = adto.this;
                JSONArray a2 = adtb.a(adilVar, adipVar);
                try {
                    adtt adttVar = adtoVar.b;
                    String jSONArray = a2.toString();
                    if (adttVar.a == null) {
                        return;
                    }
                    adttVar.a.f(new axpw(axpv.Text, jSONArray));
                    String valueOf = String.valueOf(jSONArray);
                    if (valueOf.length() == 0) {
                        return;
                    }
                    "Sending WS: ".concat(valueOf);
                } catch (IOException e) {
                    String str2 = adto.a;
                    String valueOf2 = String.valueOf(e.getMessage());
                    zep.c(str2, valueOf2.length() != 0 ? "Failed to send message: ".concat(valueOf2) : new String("Failed to send message: "));
                }
            }
        });
    }

    @Override // defpackage.adst
    public final void g() {
    }

    @Override // defpackage.adst
    public final void j(boolean z) {
        synchronized (this.d) {
            this.c = 0;
        }
        this.b.k();
    }

    @Override // defpackage.adst
    public final /* synthetic */ void m(adsr adsrVar) {
    }

    @Override // defpackage.adst
    public final void n(adsw adswVar) {
    }
}
