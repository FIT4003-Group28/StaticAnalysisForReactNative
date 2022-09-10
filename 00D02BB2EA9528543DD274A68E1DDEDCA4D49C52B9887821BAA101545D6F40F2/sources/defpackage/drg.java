package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: drg  reason: default package */
/* loaded from: classes6.dex */
public final class drg implements dfeq<dfhp> {
    public final Activity a;
    public final View b;
    public final ViewGroup c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final View h;
    public final bvlo i;
    public final drd j;
    @dzsi
    public ilo k;
    public boolean l = false;
    public boolean m;
    private final bvsl n;
    private final TextView o;

    public drg(Activity activity, dkn dknVar, dre dreVar, bvsl bvslVar, bvlo bvloVar, m mVar, dbsg<dyb> dbsgVar) {
        this.a = activity;
        this.n = bvslVar;
        this.i = bvloVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.placecard_layout, (ViewGroup) null);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        TextView textView = (TextView) inflate.findViewById(R.id.distance);
        this.o = textView;
        this.c = (ViewGroup) inflate.findViewById(R.id.venue_transition_view_group);
        this.f = (TextView) inflate.findViewById(R.id.venue_transition_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.venue_transition_icon);
        this.g = imageView;
        View findViewById = inflate.findViewById(R.id.primary_button);
        this.h = findViewById;
        this.j = dreVar.a(findViewById);
        imageView.setColorFilter(ibm.c().b(activity), PorterDuff.Mode.SRC_IN);
        dknVar.a(inflate, cjtd.a(dtxj.bL));
        if (dbsgVar.a()) {
            textView.setVisibility(0);
            findViewById.setVisibility(8);
            dbsgVar.b().a.b(mVar, new aa(this) { // from class: drf
                private final drg a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    String string;
                    drg drgVar = this.a;
                    dyf dyfVar = (dyf) obj;
                    if (dyfVar == null) {
                        drgVar.b();
                        drgVar.h.setVisibility(0);
                        return;
                    }
                    drgVar.h.setVisibility(dyfVar.a().a() == null ? 0 : 8);
                    dye c = dyfVar.c();
                    dbsk.s(drgVar.k);
                    dye dyeVar = dye.UP;
                    int i = R.drawable.indoor_outdoor_transition;
                    if (c == dyeVar || c == dye.DOWN) {
                        String g = dyfVar.b().g();
                        i = c == dye.UP ? R.drawable.up_arrow : R.drawable.down_arrow;
                        if (c == dye.UP) {
                            string = drgVar.a.getString(R.string.LH_PLACE_CARD_LEVEL_CHANGE_INSTRUCTION_UP, new Object[]{g});
                        } else {
                            string = drgVar.a.getString(R.string.LH_PLACE_CARD_LEVEL_CHANGE_INSTRUCTION_DOWN, new Object[]{g});
                        }
                    } else if (c == dye.ENTER_VENUE) {
                        string = drgVar.a.getString(R.string.LH_PLACE_CARD_OUTDOOR_INDOOR_INSTRUCTION, new Object[]{dyfVar.b().b()});
                    } else if (c == dye.ENTER_BUILDING) {
                        String e = dbsj.e(dyfVar.b().e());
                        if (e.isEmpty()) {
                            string = drgVar.a.getString(R.string.ENTER_DEFAULT_BUILDING);
                        } else {
                            string = drgVar.a.getString(R.string.LH_PLACE_CARD_OUTDOOR_INDOOR_INSTRUCTION, new Object[]{e});
                        }
                    } else if (c == dye.EXIT_VENUE) {
                        string = drgVar.a.getString(R.string.LH_PLACE_CARD_INDOOR_OUTDOOR_INSTRUCTION, new Object[]{dyfVar.a().b()});
                    } else if (c == dye.EXIT_BUILDING) {
                        String e2 = dbsj.e(dyfVar.a().e());
                        if (e2.isEmpty()) {
                            string = drgVar.a.getString(R.string.EXIT_DEFAULT_BUILDING);
                        } else {
                            string = drgVar.a.getString(R.string.LH_PLACE_CARD_INDOOR_OUTDOOR_INSTRUCTION, new Object[]{e2});
                        }
                    } else {
                        string = null;
                    }
                    boolean z = !TextUtils.isEmpty(string);
                    drgVar.m = z;
                    if (z) {
                        drgVar.f.setText(string);
                        drgVar.g.setImageDrawable(drgVar.i.b(drgVar.a.getResources(), i, bvlw.a));
                        drgVar.c.setVisibility(0);
                        return;
                    }
                    drgVar.b();
                }
            });
        }
    }

    public final void b() {
        this.f.setText("");
        this.c.setVisibility(8);
    }

    @Override // defpackage.dfeq
    public final /* bridge */ /* synthetic */ void n(@dzsi dfhp dfhpVar) {
        dfhp dfhpVar2 = dfhpVar;
        if (this.k == null || dfhpVar2 == null) {
            return;
        }
        float f = dfhpVar2.a;
        this.o.setText((f >= 20.0f || this.m) ? this.n.c((int) f, null, false, true) : "");
    }
}
