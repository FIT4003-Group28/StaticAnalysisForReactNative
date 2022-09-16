package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvac  reason: default package */
/* loaded from: classes5.dex */
public final class cvac implements cvaa {
    public final cvab a;
    public cuvf c;
    public cvbj d = null;
    public cvah b = null;

    public cvac(cvab cvabVar) {
        cvabVar.setPresenter(this);
        this.a = cvabVar;
    }

    private final synchronized void b() {
        RippleDrawable rippleDrawable;
        cvaf cvafVar;
        String str;
        String b;
        long millis;
        cvab cvabVar = this.a;
        cvah cvahVar = this.b;
        if (((cvaf) cvabVar).o.a()) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(((cvaf) cvabVar).o.b().g()), new ColorDrawable(((cvaf) cvabVar).o.b().f()), null);
            cvafVar = (cvaf) cvabVar;
        } else {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(((cvaf) cvabVar).i), new ColorDrawable(((cvaf) cvabVar).h), null);
            cvafVar = (cvaf) cvabVar;
        }
        cvafVar.setBackground(rippleDrawable);
        ((cvaf) cvabVar).e.setText(cuwg.b(((cvaf) cvabVar).getContext(), cvahVar.a(), cvahVar.d()));
        dbsg<cugu> c = cvahVar.c();
        if (((cvaf) cvabVar).d == null) {
            ((cvaf) cvabVar).a(LayoutInflater.from(((cvaf) cvabVar).getContext()).inflate(R.layout.default_preview_layout, (ViewGroup) cvabVar, false));
        }
        if (c.a() && ((cvaf) cvabVar).c) {
            cugu b2 = c.b();
            int b3 = cvahVar.b();
            TextView textView = (TextView) ((cvaf) cvabVar).d.findViewById(R.id.last_message_timestamp);
            TextView textView2 = (TextView) ((cvaf) cvabVar).d.findViewById(R.id.number_of_unread_messages_or_status);
            Context context = ((cvaf) cvabVar).getContext();
            if (b2.g().equals(cugo.OUTGOING_SENDING)) {
                cstd.a();
                millis = System.currentTimeMillis();
            } else {
                millis = TimeUnit.MICROSECONDS.toMillis(b2.d().longValue());
            }
            textView.setText(cuvy.a(context, millis));
            if (b3 == 0) {
                switch (b2.g().ordinal()) {
                    case 6:
                        textView2.setVisibility(0);
                        textView2.setText(R.string.message_sent_failed);
                        break;
                    case 7:
                        textView2.setVisibility(0);
                        textView2.setText(R.string.message_sent_success);
                        break;
                    case 8:
                        textView2.setVisibility(0);
                        textView2.setText(R.string.message_sent_delivered);
                        break;
                    case 9:
                        textView2.setVisibility(0);
                        textView2.setText(R.string.message_sent_read);
                        break;
                    case 10:
                        textView2.setVisibility(0);
                        textView2.setText(R.string.message_delivery_failed);
                        break;
                    default:
                        textView2.setVisibility(4);
                        break;
                }
            } else if (b3 > 1) {
                textView2.setVisibility(0);
                int i = b3 - 1;
                textView2.setText(((cvaf) cvabVar).getContext().getResources().getQuantityString(R.plurals.num_unread_messages, i, Integer.valueOf(i)));
            } else {
                textView2.setVisibility(4);
            }
            if (((cvaf) cvabVar).o.a()) {
                ((cvaf) cvabVar).o.b().e().b();
                ((cvaf) cvabVar).o.b().e().b();
            } else {
                qf.a(textView, ((cvaf) cvabVar).n);
                qf.a(textView2, ((cvaf) cvabVar).n);
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(17, ((View) ((cvaf) cvabVar).a).getId());
        layoutParams.addRule(16, ((cvaf) cvabVar).d.getId());
        layoutParams.addRule(1, ((View) ((cvaf) cvabVar).a).getId());
        layoutParams.addRule(0, ((cvaf) cvabVar).d.getId());
        ((cvaf) cvabVar).b.setLayoutParams(layoutParams);
        if (cvahVar.b() > 0) {
            if (((cvaf) cvabVar).o.a()) {
                cuwf d = ((cvaf) cvabVar).o.b().d();
                TextView textView3 = ((cvaf) cvabVar).e;
                d.b();
                cuwf c2 = ((cvaf) cvabVar).o.b().c();
                TextView textView4 = ((cvaf) cvabVar).f;
                c2.b();
            } else {
                qf.a(((cvaf) cvabVar).e, ((cvaf) cvabVar).k);
                qf.a(((cvaf) cvabVar).f, ((cvaf) cvabVar).m);
            }
            ((cvaf) cvabVar).f.setMaxLines(3);
        } else {
            if (((cvaf) cvabVar).o.a()) {
                cuwf b4 = ((cvaf) cvabVar).o.b().b();
                TextView textView5 = ((cvaf) cvabVar).e;
                b4.b();
                cuwf a = ((cvaf) cvabVar).o.b().a();
                TextView textView6 = ((cvaf) cvabVar).f;
                a.b();
            } else {
                qf.a(((cvaf) cvabVar).e, ((cvaf) cvabVar).j);
                qf.a(((cvaf) cvabVar).f, ((cvaf) cvabVar).l);
            }
            ((cvaf) cvabVar).f.setMaxLines(1);
        }
        if (!this.b.c().a()) {
            return;
        }
        ContactId b5 = this.b.c().b().b();
        for (cufj cufjVar : this.b.d()) {
            if (cufjVar.a().equals(b5)) {
                cvab cvabVar2 = this.a;
                cvah cvahVar2 = this.b;
                dbsg<cugu> c3 = cvahVar2.c();
                if (!TextUtils.isEmpty(((cvaf) cvabVar2).g)) {
                    return;
                }
                if (c3.a()) {
                    cugu b6 = c3.b();
                    dbsg<String> h = b6.h();
                    if (dbsj.d(h.f())) {
                        cugo cugoVar = cugo.INVALID;
                        int a2 = b6.f().a();
                        int i2 = a2 - 1;
                        if (a2 == 0) {
                            throw null;
                        }
                        h = i2 != 1 ? b6.e() : dbsg.i(b6.f().d());
                    }
                    if (h.a()) {
                        if (c3.b().o() == 2) {
                            str = ((cvaf) cvabVar2).getResources().getString(R.string.self_sender);
                        } else {
                            ContactId b7 = c3.b().b();
                            Iterator<cufj> it = cvahVar2.d().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    cufj next = it.next();
                                    if (next.a().equals(b7) && next.b().a()) {
                                        str = next.b().b();
                                    }
                                } else {
                                    str = "";
                                }
                            }
                        }
                        TextView textView7 = ((cvaf) cvabVar2).f;
                        if (!TextUtils.isEmpty(str) && c3.b().k().a() != cugt.OVERLAY) {
                            b = ((cvaf) cvabVar2).getResources().getString(R.string.last_message_received_format, str, h.b());
                            textView7.setText(b);
                            return;
                        }
                        b = h.b();
                        textView7.setText(b);
                        return;
                    }
                }
                cstl.a("ConvCellView");
                return;
            }
        }
    }

    @Override // defpackage.cuvu
    public final synchronized void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvaa
    public final void a() {
        cvbj cvbjVar = this.d;
        if (cvbjVar != null) {
            this.b.a();
            cvbm cvbmVar = cvbjVar.a;
            cvah cvahVar = cvbjVar.b;
            ((cvbi) cvbmVar.g).e.a(cvahVar.a().a());
        }
    }

    @Override // defpackage.cuvu
    public final synchronized void z() {
        if (this.b != null) {
            b();
            cuvf cuvfVar = this.c;
            if (cuvfVar != null) {
                cuvfVar.z();
                return;
            } else {
                cstl.a("ConvCellPresenter");
                return;
            }
        }
        cstl.a("ConvCellPresenter");
    }
}
