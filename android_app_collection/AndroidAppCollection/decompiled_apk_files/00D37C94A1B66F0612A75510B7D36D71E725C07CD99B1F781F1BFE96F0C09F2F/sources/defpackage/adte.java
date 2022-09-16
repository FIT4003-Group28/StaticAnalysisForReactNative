package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: adte  reason: default package */
/* loaded from: classes.dex */
final class adte extends axps {
    private static final String d = zep.a("MDX.transport");
    private final adss e;
    private final adts f;
    private final yni g;
    private final acvh h;

    public adte(axpj axpjVar, adss adssVar, adts adtsVar, yni yniVar, acvh acvhVar) {
        super(axpjVar);
        this.e = adssVar;
        this.f = adtsVar;
        this.g = yniVar;
        acvhVar.getClass();
        this.h = acvhVar;
    }

    @Override // defpackage.axps
    protected final void a(IOException iOException) {
        zep.f(d, "Unexpected error on web socket", iOException);
    }

    @Override // defpackage.axps
    protected final void b(axpw axpwVar) {
        try {
            String c = axpwVar.c();
            String valueOf = String.valueOf(c);
            if (valueOf.length() != 0) {
                "Web Socket Frame - Payload text: ".concat(valueOf);
            }
            if (TextUtils.isEmpty(c)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(c);
            try {
                adtd b = adtd.b(jSONArray);
                this.g.d(new adaf(b.a, "local_ws"));
                acvh acvhVar = this.h;
                asny asnyVar = asny.LATENCY_ACTION_MDX_COMMAND;
                aopa createBuilder = asno.a.createBuilder();
                aopa createBuilder2 = asnt.a.createBuilder();
                createBuilder2.copyOnWrite();
                asnt asntVar = (asnt) createBuilder2.instance;
                asntVar.f = 3;
                asntVar.b |= 8;
                String str = b.a.al;
                createBuilder2.copyOnWrite();
                asnt asntVar2 = (asnt) createBuilder2.instance;
                str.getClass();
                asntVar2.b |= 2;
                asntVar2.d = str;
                asnt asntVar3 = (asnt) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                asno asnoVar = (asno) createBuilder.instance;
                asntVar3.getClass();
                asnoVar.w = asntVar3;
                asnoVar.c |= 1048576;
                acvhVar.n(asnyVar, (asno) createBuilder.mo39build());
                this.h.u("mdx_cr", asny.LATENCY_ACTION_MDX_COMMAND);
                this.e.b(b);
            } catch (JSONException e) {
                zep.f(d, String.format("Invalid message format: %s", jSONArray), e);
            }
        } catch (JSONException e2) {
            String str2 = d;
            String valueOf2 = String.valueOf(e2.getMessage());
            zep.m(str2, valueOf2.length() != 0 ? "Failed to parse message: ".concat(valueOf2) : new String("Failed to parse message: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axps
    public final void c() {
        this.f.a();
    }

    @Override // defpackage.axps
    protected final void d(String str, boolean z) {
        String.format("onClose: reason=%s initiatedByRemote=%s", str, Boolean.valueOf(z));
        this.f.b();
    }
}
