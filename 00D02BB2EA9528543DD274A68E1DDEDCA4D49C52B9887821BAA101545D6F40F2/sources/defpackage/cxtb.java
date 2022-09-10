package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxtb  reason: default package */
/* loaded from: classes5.dex */
public final class cxtb extends abg<cxtg> {
    final /* synthetic */ Context a;
    final /* synthetic */ cxti e;

    public cxtb(cxti cxtiVar, Context context) {
        this.e = cxtiVar;
        this.a = context;
    }

    @Override // defpackage.abg
    public final int c() {
        return this.e.c() + (this.e.j != null ? 1 : 0);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cxtg d(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.a).inflate(i, (ViewGroup) this.e.r, false);
        if (i == R.layout.peoplekit_facerows_item) {
            this.e.t.add(inflate);
        }
        return new cxtg(inflate);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cxtg cxtgVar, int i) {
        cxpr cxprVar;
        Resources resources;
        int i2;
        String b;
        View view = cxtgVar.s;
        if (i(i) == R.layout.peoplekit_more_button) {
            this.e.f(view);
            return;
        }
        cxti cxtiVar = this.e;
        view.setContentDescription(null);
        view.setBackgroundColor(akm.c(cxtiVar.a, cxtiVar.D.a));
        if (i == 0) {
            view.setPadding(cxtiVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_facerows_item_end_padding), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            i = 0;
        }
        if (cxtiVar.C) {
            view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), 0);
        }
        CoalescedChannels coalescedChannels = cxtiVar.l.get(i);
        Channel channel = coalescedChannels.b().get(0);
        if (cxtiVar.o.containsKey(view)) {
            cxprVar = cxtiVar.o.get(view);
            cxprVar.i();
        } else {
            cxprVar = new cxpr(cxtiVar.a, cxtiVar.e, cxtiVar.g);
            cxprVar.h(cxtiVar.D);
            cxtiVar.n.put(cxprVar, view);
            cxtiVar.o.put(view, cxprVar);
        }
        cxprVar.k();
        if (cxtiVar.x != 0) {
            resources = cxtiVar.a.getResources();
            i2 = cxtiVar.x;
        } else {
            resources = cxtiVar.a.getResources();
            i2 = R.dimen.peoplekit_avatar_size;
        }
        cxprVar.e(resources.getDimensionPixelSize(i2));
        cxprVar.d = cxtiVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_facerows_avatar_icon_size);
        cxprVar.c = cxtiVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_facerows_avatar_icon_offset);
        Channel channel2 = coalescedChannels.b().get(0);
        if (cxtiVar.i.r() && channel2.y()) {
            cxprVar.g(cxtiVar.p, cxtiVar.z ? 0 : akm.c(cxtiVar.a, R.color.quantum_white_100));
        }
        cxprVar.c(coalescedChannels);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.peoplekit_facerows_avatar);
        relativeLayout.removeAllViews();
        relativeLayout.addView(cxprVar.a);
        cxtiVar.m.put(cxprVar, channel);
        TextView textView = (TextView) view.findViewById(R.id.peoplekit_facerows_contact_name);
        textView.setText(coalescedChannels.e() == 1 ? cxrc.h(coalescedChannels, cxtiVar.a) : channel.i(cxtiVar.a));
        textView.setTextColor(akm.c(cxtiVar.a, cxtiVar.D.e));
        if (cxtiVar.y != 0) {
            int dimensionPixelSize = cxtiVar.a.getResources().getDimensionPixelSize(cxtiVar.y);
            textView.setTextSize(0, dimensionPixelSize);
            if (dimensionPixelSize > cxtiVar.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_facerows_item_name_size)) {
                textView.setLines(2);
            }
        }
        TextView textView2 = (TextView) view.findViewById(R.id.peoplekit_facerows_contact_method);
        if (coalescedChannels.e() == 1) {
            if (coalescedChannels.a() != 1 || coalescedChannels.c().isEmpty()) {
                b = cxtiVar.a.getString(R.string.peoplekit_group_contact_method, Integer.valueOf(coalescedChannels.a()));
            } else {
                if (cxtiVar.A) {
                    b = coalescedChannels.c().get(0).b(cxtiVar.a);
                }
                textView2.setText("");
            }
            textView2.setText(b);
        } else {
            if (cxtiVar.A) {
                b = channel.b(cxtiVar.a);
                textView2.setText(b);
            }
            textView2.setText("");
        }
        textView2.setTextColor(akm.c(cxtiVar.a, cxtiVar.D.f));
        if (cxtiVar.d.f(channel)) {
            cxprVar.f(2);
            Context context = cxtiVar.a;
            view.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, channel.i(context), channel.b(cxtiVar.a)));
        }
        view.setOnClickListener(new cxtd(cxtiVar, channel, view, coalescedChannels));
        cxtiVar.c.f(channel);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        cxti cxtiVar = this.e;
        return (cxtiVar.j == null || i != cxtiVar.c()) ? R.layout.peoplekit_facerows_item : R.layout.peoplekit_more_button;
    }
}
