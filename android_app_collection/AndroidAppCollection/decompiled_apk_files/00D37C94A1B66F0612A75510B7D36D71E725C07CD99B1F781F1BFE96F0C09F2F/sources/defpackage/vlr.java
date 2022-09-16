package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vlr  reason: default package */
/* loaded from: classes4.dex */
public final class vlr implements vld {
    public final Context a;
    public final String b;
    public final Set c;
    public final boolean d;
    public SharedPreferences e;
    private final ankw f;
    private final amqo g;
    private final vln h;

    public vlr(vlo vloVar) {
        this.a = vloVar.a;
        this.f = vloVar.b;
        this.b = vloVar.c;
        this.c = vloVar.d;
        this.h = vloVar.g;
        this.d = vloVar.e;
        this.g = vloVar.f;
    }

    public static vlo d(Context context, ankw ankwVar) {
        return new vlo(context.getApplicationContext(), ankwVar);
    }

    @Override // defpackage.vld
    public final ankt a() {
        if (((Boolean) this.g.get()).booleanValue()) {
            return ankq.a;
        }
        return this.f.qp(new vlm(this, 1));
    }

    @Override // defpackage.vld
    public final ankt b(aoqu aoquVar) {
        vln vlnVar = this.h;
        return anlz.q(vlnVar.a.a(new vlq(this.e, this.c), aoquVar));
    }

    @Override // defpackage.vld
    public final ankt c() {
        return this.f.qp(new vlm(this));
    }
}
