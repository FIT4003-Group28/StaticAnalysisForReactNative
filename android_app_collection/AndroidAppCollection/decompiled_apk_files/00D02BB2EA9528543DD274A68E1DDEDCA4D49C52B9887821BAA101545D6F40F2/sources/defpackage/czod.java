package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: czod  reason: default package */
/* loaded from: classes5.dex */
public final class czod {
    public static final czod a;
    public static final AtomicBoolean b;
    public SurveyDataImpl c;
    public String d;
    public List<mx<String, String>> e;
    public long f;
    public final cqat g = new cqaz();
    public String h;
    public long i;
    public acwq j;

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.tvrecommendations");
        a = new czod();
        b = new AtomicBoolean(false);
    }

    private czod() {
        czsi.a = new czoc(this);
        this.f = 0L;
        this.i = System.currentTimeMillis();
    }

    public static void b() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final void a(dtup dtupVar, czpb czpbVar, Context context) {
        String str = TextUtils.isEmpty(this.d) ? null : this.d;
        if (!czov.a(dydo.b(czov.a))) {
            return;
        }
        czoz a2 = czoz.a();
        dtue bZ = dtuu.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtuu dtuuVar = (dtuu) bZ.b;
        dtupVar.getClass();
        dtuuVar.b = dtupVar;
        dtuuVar.a = 4;
        a2.d(bZ.bK(), czpbVar.b(), czpbVar.c(), context, str);
    }

    public final void c() {
        acwq acwqVar = this.j;
        if (acwqVar != null) {
            this.c.a();
            acwqVar.a.d = null;
        }
    }
}
