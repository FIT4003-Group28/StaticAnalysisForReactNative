package defpackage;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: yty  reason: default package */
/* loaded from: classes4.dex */
public class yty extends yua {
    private final JSONObject a;
    private final cfa b;
    private final boolean c;

    public yty(String str, JSONObject jSONObject, cfa cfaVar, cez cezVar) {
        this(str, jSONObject, cfaVar, cezVar, false);
    }

    @Override // defpackage.yua
    public final String kY() {
        return this.c ? "application/json" : "application/json; charset=utf-8";
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        try {
            return this.a.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            zep.d("Unable to encode JSON request", e);
            return null;
        }
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        try {
            return cfb.b(new JSONObject(new String(cewVar.b, acx.i(cewVar.c, "utf-8"))), acx.g(cewVar));
        } catch (UnsupportedEncodingException | JSONException e) {
            return cfb.a(new cey(e));
        }
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        this.b.lG((JSONObject) obj);
    }

    public yty(String str, JSONObject jSONObject, cfa cfaVar, cez cezVar, boolean z) {
        super(2, str, cezVar);
        this.a = jSONObject;
        this.b = cfaVar;
        this.c = z;
    }
}
