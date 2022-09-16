package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aiah  reason: default package */
/* loaded from: classes.dex */
public final class aiah implements Observer, afkg, ahzx, aiai {
    private final zdp A;
    private final afmw B;
    private final amqo C;
    private final yzj D;
    private final airw E;
    private int F;
    private long G;
    private aiad H;
    private final aypf I;

    /* renamed from: J  reason: collision with root package name */
    private final zdl f49J;
    public final ahzy a;
    public final amqo b;
    public final amqo c;
    public final amqo d;
    public String e;
    public String f;
    public int g;
    public int h;
    public FormatStreamModel i;
    public FormatStreamModel j;
    public aanv k;
    public asmc[] l;
    public asmc[] m;
    public final aiag n;
    public final aiae o;
    public boolean p;
    public long q;
    public final HashMap r;
    public float s;
    public boolean t;
    public final aiad u;
    private final Context v;
    private final ampq w;
    private final afkf x;
    private final afst y;
    private final yrj z;

    public aiah(ahzy ahzyVar, Context context, ampq ampqVar, afkf afkfVar, afst afstVar, yrj yrjVar, zdp zdpVar, afmw afmwVar, amqo amqoVar, amqo amqoVar2, amqo amqoVar3, amqo amqoVar4, airw airwVar) {
        yyx yyxVar = new yyx(context, yrjVar, null);
        ahzyVar.getClass();
        this.a = ahzyVar;
        ((aiaj) ahzyVar).E = this;
        context.getClass();
        this.v = context;
        afkfVar.getClass();
        this.x = afkfVar;
        afstVar.getClass();
        this.y = afstVar;
        yrjVar.getClass();
        this.z = yrjVar;
        zdpVar.getClass();
        this.A = zdpVar;
        afmwVar.getClass();
        this.B = afmwVar;
        amqoVar.getClass();
        this.b = amqoVar;
        amqoVar2.getClass();
        this.c = amqoVar2;
        amqoVar3.getClass();
        this.d = amqoVar3;
        amqoVar4.getClass();
        this.C = amqoVar4;
        this.D = yyxVar;
        this.w = ampqVar;
        this.E = airwVar;
        this.n = new aiag(this);
        this.o = new aiae(this);
        this.u = new aiad(this, 1);
        this.I = new aypf();
        BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
        this.r = new HashMap();
        this.f49J = new zdl(context);
    }

    private final float k() {
        FormatStreamModel formatStreamModel = this.j;
        return (formatStreamModel == null || !formatStreamModel.x()) ? this.s : this.j.b();
    }

    private static void l(JSONObject jSONObject, asmc[] asmcVarArr) {
        if (asmcVarArr == null) {
            return;
        }
        for (asmc asmcVar : asmcVarArr) {
            String str = asmcVar.e;
            if (str.startsWith("innertube.build.") || str.equals("e") || str.equals("logged_in")) {
                jSONObject.put(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
            }
        }
    }

    @Override // defpackage.afkg
    public final synchronized void a(afkv afkvVar) {
        this.F += afkvVar.b;
        this.G += afkvVar.c;
        this.t = afkvVar.d;
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.ahzx
    public final void d() {
        g();
    }

    public final synchronized float e() {
        float f;
        int i = this.F;
        f = i == 0 ? 0.0f : ((float) (this.G * 8)) / (i / 1000.0f);
        this.G = 0L;
        this.F = 0;
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, ahzy] */
    @Override // defpackage.aiai
    public final void f() {
        if (!this.p) {
            if (this.H == null) {
                this.H = new aiad(this);
            }
            this.p = true;
            ?? r0 = this.a;
            aiaj aiajVar = (aiaj) r0;
            if (aiajVar.e == null) {
                LayoutInflater.from(aiajVar.getContext()).inflate(R.layout.default_nerd_stats_overlay, (ViewGroup) r0);
                aiajVar.e = aiajVar.findViewById(R.id.nerd_stats_layout);
                aiajVar.f = aiajVar.findViewById(R.id.dismiss_button);
                aiajVar.f.setOnClickListener(r0);
                aiajVar.f.setVisibility(0);
                aiajVar.g = aiajVar.findViewById(R.id.copy_debug_info_button);
                aiajVar.g.setOnClickListener(r0);
                aiajVar.g.setVisibility(0);
                aiajVar.h = (TextView) aiajVar.findViewById(R.id.device_info);
                aiajVar.i = (TextView) aiajVar.findViewById(R.id.video_id);
                aiajVar.j = (TextView) aiajVar.findViewById(R.id.cpn);
                aiajVar.l = (TextView) aiajVar.findViewById(R.id.player_type);
                aiajVar.m = (TextView) aiajVar.findViewById(R.id.playback_type);
                aiajVar.n = (TextView) aiajVar.findViewById(R.id.video_format);
                aiajVar.q = (TextView) aiajVar.findViewById(R.id.audio_format);
                aiajVar.r = (TextView) aiajVar.findViewById(R.id.volume);
                aiajVar.s = (TextView) aiajVar.findViewById(R.id.bandwidth_estimate);
                aiajVar.u = (ImageView) aiajVar.findViewById(R.id.bandwidth_sparkline);
                aiajVar.v = (TextView) aiajVar.findViewById(R.id.readahead);
                aiajVar.x = (ImageView) aiajVar.findViewById(R.id.readahead_sparkline);
                aiajVar.y = (TextView) aiajVar.findViewById(R.id.viewport);
                aiajVar.z = (TextView) aiajVar.findViewById(R.id.dropped_frames);
                aiajVar.A = (TextView) aiajVar.findViewById(R.id.battery_current_title);
                aiajVar.B = (TextView) aiajVar.findViewById(R.id.battery_current);
                aiajVar.k = (TextView) aiajVar.findViewById(R.id.mystery_text);
                aiajVar.C = aiajVar.findViewById(R.id.latency_title);
                aiajVar.D = (TextView) aiajVar.findViewById(R.id.latency);
                aiajVar.o = aiajVar.findViewById(R.id.video_gl_rendering_mode_title);
                aiajVar.p = (TextView) aiajVar.findViewById(R.id.video_gl_rendering_mode);
                aiajVar.G = (TextView) aiajVar.findViewById(R.id.content_protection);
                aiajVar.F = aiajVar.findViewById(R.id.content_protection_title);
                aiajVar.C.measure(0, 0);
                int i = zew.i(aiajVar.getResources().getDisplayMetrics(), 100);
                int measuredHeight = aiajVar.C.getMeasuredHeight() - 1;
                aiajVar.t = new yzp(i, measuredHeight, aiaj.a, aiaj.b);
                aiajVar.w = new yzp(i, measuredHeight, aiaj.c, aiaj.d);
                aiajVar.A.setVisibility(8);
                aiajVar.B.setVisibility(8);
            }
            aiajVar.e.setVisibility(0);
            ahzy ahzyVar = this.a;
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            String str3 = Build.VERSION.RELEASE;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            ((aiaj) ahzyVar).h.setText(sb.toString());
            this.a.b(this.i);
            this.a.a(this.j);
            j();
            this.a.d((afmv) this.B.get());
            i();
            h();
            this.I.g(this.H.g(this.E));
            if (this.w.h()) {
                this.I.d(((yve) this.w.c()).d().I().G(aypa.a()).o(aaku.q).Z(new ayqb() { // from class: ahzz
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        aiah aiahVar = aiah.this;
                        if (!((awvc) obj).d) {
                            aiahVar.g();
                        }
                    }
                }));
            }
            this.x.d(this);
            this.B.addObserver(this);
            return;
        }
        g();
    }

    public final void g() {
        if (this.p) {
            this.p = false;
            View view = ((aiaj) this.a).e;
            if (view != null) {
                view.setVisibility(8);
            }
            this.I.c();
            this.x.e(this);
            this.B.deleteObserver(this);
        }
    }

    public final void h() {
        Object obj = this.C.get();
        ahzy ahzyVar = this.a;
        ((aiaj) ahzyVar).k.setText(((aequ) this.C.get()).d);
        ahzy ahzyVar2 = this.a;
        aequ aequVar = (aequ) obj;
        String str = aequVar.a;
        aiaj aiajVar = (aiaj) ahzyVar2;
        if (aiajVar.G != null && aiajVar.F != null) {
            if (str == null || str.isEmpty()) {
                aiajVar.G.setVisibility(8);
                aiajVar.F.setVisibility(8);
            } else {
                aiajVar.G.setVisibility(0);
                aiajVar.F.setVisibility(0);
                aiajVar.G.setText(str);
            }
        }
        ((aiaj) this.a).l.setText(aiaj.e(aequVar.b));
        ((aiaj) this.a).m.setText(aiaj.e(aequVar.c));
    }

    public final void i() {
        ahzy ahzyVar = this.a;
        ((aiaj) ahzyVar).j.setText(this.f);
        ahzy ahzyVar2 = this.a;
        ((aiaj) ahzyVar2).i.setText(this.e);
        ahzy ahzyVar3 = this.a;
        aanv aanvVar = this.k;
        aiaj aiajVar = (aiaj) ahzyVar3;
        if (aiajVar.p == null) {
            return;
        }
        if (aanvVar == null || aanvVar == aanv.NOOP || aanvVar == aanv.RECTANGULAR_2D) {
            aiajVar.o.setVisibility(8);
            aiajVar.p.setVisibility(8);
            return;
        }
        aiajVar.o.setVisibility(0);
        aiajVar.p.setVisibility(0);
        aiajVar.p.setText(aanvVar.toString().toLowerCase(Locale.US));
    }

    public final void j() {
        float k = k();
        ahzy ahzyVar = this.a;
        int a = this.f49J.a();
        float m = agel.m(k);
        aiaj aiajVar = (aiaj) ahzyVar;
        if (aiajVar.r != null) {
            int round = Math.round(m * a);
            double d = k;
            Double.isNaN(d);
            long round2 = Math.round(d * 10.0d);
            StringBuilder sb = new StringBuilder(71);
            sb.append(a);
            sb.append("%/");
            sb.append(round);
            sb.append("%(content loudness ");
            double d2 = round2;
            Double.isNaN(d2);
            sb.append(d2 / 10.0d);
            sb.append(" dB)");
            aiajVar.r.setText(sb.toString());
        }
    }

    @Override // defpackage.ahzx
    public final void rW() {
        String str;
        String str2;
        yzj yzjVar = this.D;
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.y.b().entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            String str3 = Build.VERSION.RELEASE;
            String str4 = Build.ID;
            String str5 = Build.VERSION.INCREMENTAL;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 2 + String.valueOf(str4).length() + String.valueOf(str5).length());
            sb.append(str3);
            sb.append(".");
            sb.append(str4);
            sb.append(".");
            sb.append(str5);
            jSONObject.put("cosver", sb.toString());
            jSONObject.put("videoid", this.e);
            jSONObject.put("cpn", this.f);
            jSONObject.put("fmt", ahfc.d(this.i));
            jSONObject.put("afmt", ahfc.d(this.j));
            jSONObject.put("bh", this.q);
            jSONObject.put("conn", this.z.a());
            jSONObject.put("volume", this.f49J.a());
            jSONObject.put("loudness", String.format(Locale.US, "%.3f", Float.valueOf(k())));
            jSONObject.put("bat", String.format(Locale.US, "%.3f:%d", Float.valueOf(this.A.a()), Integer.valueOf(this.A.b() ? 1 : 0)));
            int intValue = ((Integer) this.c.get()).intValue() - this.h;
            int intValue2 = ((Integer) this.b.get()).intValue() - this.g;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(intValue);
            sb2.append("/");
            sb2.append(intValue2);
            jSONObject.put("df", sb2.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            jSONObject.put("time", simpleDateFormat.format(new Date()));
            jSONObject.put("glmode", this.k);
            jSONObject.put("drm", ((aequ) this.C.get()).a);
            jSONObject.put("mtext", ((aequ) this.C.get()).d);
            if (this.r.containsKey(this.f)) {
                ArrayList arrayList = (ArrayList) this.r.get(this.f);
                if (arrayList == null) {
                    str2 = "";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        afkn afknVar = (afkn) arrayList.get(i);
                        sb3.append(afknVar.i());
                        sb3.append(":");
                        sb3.append(afknVar.a());
                        sb3.append(":");
                        sb3.append(afknVar.k());
                        sb3.append(",");
                    }
                    str2 = sb3.toString();
                }
            } else {
                str2 = "No errors";
            }
            jSONObject.put("error", str2);
            l(jSONObject, this.l);
            l(jSONObject, this.m);
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.v.getSystemService("clipboard");
        int i2 = R.string.nerd_stats_copy_debug_info_error;
        if (str != null && clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("YouTube Player Debug Info", str));
            i2 = R.string.nerd_stats_copy_debug_info_success;
        }
        yzjVar.c(i2);
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void rX(long j) {
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        afmw afmwVar = this.B;
        if (observable != afmwVar || !this.p) {
            return;
        }
        this.a.d((afmv) afmwVar.get());
    }
}
