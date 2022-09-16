package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.remoteloaded.SubscribeButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.SubscriptionNotificationButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.m;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.d, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, g {
    public int a;
    public int b;
    public final FrameLayout c;
    public final SubscribeButton d;
    public final View e;
    public a f;
    public b g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a h;
    private final CircularImageView k;
    private final TextView l;
    private final TextView m;
    private final Set n;
    private final TextView p;
    private final TextView q;
    private final Set r;
    private final SubscriptionNotificationButton t;
    private final Animation u;
    private final Animation v;
    private final c w;
    private aoob o = aoob.b;
    private aoob s = aoob.b;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b i = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;

    private d(Context context, FrameLayout frameLayout) {
        this.c = frameLayout;
        LayoutInflater.from(context).inflate(R.layout.video_details_view, frameLayout);
        this.k = (CircularImageView) frameLayout.findViewById(R.id.channel_thumbnail);
        TextView textView = (TextView) frameLayout.findViewById(R.id.collapsed_title);
        this.l = textView;
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.collapsed_subtitle);
        this.m = textView2;
        HashSet hashSet = new HashSet();
        this.n = hashSet;
        hashSet.add(textView);
        hashSet.add(textView2);
        TextView textView3 = (TextView) frameLayout.findViewById(R.id.expanded_title);
        this.p = textView3;
        TextView textView4 = (TextView) frameLayout.findViewById(R.id.expanded_subtitle);
        this.q = textView4;
        HashSet hashSet2 = new HashSet();
        this.r = hashSet2;
        hashSet2.add(textView3);
        hashSet2.add(textView4);
        this.d = (SubscribeButton) frameLayout.findViewById(R.id.subscribe_button);
        SubscriptionNotificationButton subscriptionNotificationButton = (SubscriptionNotificationButton) frameLayout.findViewById(R.id.subscription_notification_button);
        this.t = subscriptionNotificationButton;
        subscriptionNotificationButton.a = new m(context);
        this.e = frameLayout.findViewById(R.id.expanded_top_bar);
        this.u = AnimationUtils.loadAnimation(context, R.anim.expand_right);
        this.v = AnimationUtils.loadAnimation(context, R.anim.collapse_left);
        this.w = new c(this);
        this.a = 1;
        this.b = 1;
    }

    public static d a(Context context, FrameLayout frameLayout) {
        d dVar = new d(context, frameLayout);
        dVar.k.setOnClickListener(dVar);
        dVar.l.setOnClickListener(dVar);
        dVar.m.setOnClickListener(dVar);
        dVar.d.setOnClickListener(dVar);
        dVar.d.f = dVar;
        dVar.t.c = dVar;
        return dVar;
    }

    private final void n() {
        for (View view : this.n) {
            view.setVisibility(8);
        }
    }

    private final void o() {
        for (View view : this.r) {
            view.setVisibility(8);
        }
        this.d.setVisibility(8);
        this.t.setVisibility(8);
    }

    public final void b() {
        if (this.b == 3) {
            l();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.g
    public final void c() {
        b();
    }

    public final void d() {
        m(1);
        e(null);
        g(null);
        f(null);
        i(null);
        h(null);
    }

    public final void e(Bitmap bitmap) {
        this.k.setImageBitmap(bitmap);
    }

    public final void f(CharSequence charSequence) {
        this.m.setText(charSequence);
    }

    public final void g(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    public final void h(CharSequence charSequence) {
        this.q.setText(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public final void j(VideoDetails videoDetails) {
        if (videoDetails == null) {
            return;
        }
        if (videoDetails.equals(VideoDetails.a)) {
            d();
            return;
        }
        g(videoDetails.a().c());
        f(videoDetails.a().b());
        this.o = videoDetails.a().a();
        i(videoDetails.b().c());
        h(videoDetails.b().b());
        this.s = videoDetails.b().a();
        m(2);
    }

    public final void k() {
        for (View view : this.n) {
            view.setVisibility(0);
        }
    }

    public final void l() {
        for (View view : this.r) {
            view.setVisibility(0);
        }
        SubscribeButton subscribeButton = this.d;
        int i = subscribeButton.e;
        if (i == 0) {
            subscribeButton.setVisibility(8);
        } else if (i == 1 || i == 2 || i == 3) {
            subscribeButton.setVisibility(0);
            this.i.c(this.d.d.I());
        } else {
            throw new AssertionError("Subscribe button in invalid state.");
        }
        SubscriptionNotificationButton subscriptionNotificationButton = this.t;
        if (subscriptionNotificationButton.e.equals(SubscriptionNotificationButtonData.a) || subscriptionNotificationButton.f.equals(SubscriptionNotificationMenuData.a)) {
            this.t.setVisibility(8);
            return;
        }
        int i2 = this.d.e;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.t.setVisibility(8);
        } else if (i2 == 3) {
            this.t.setVisibility(0);
            this.i.c(this.t.e.c().I());
        } else {
            throw new AssertionError("Subscribe button in invalid state.");
        }
    }

    final void m(int i) {
        int i2 = this.b;
        if (i2 != i) {
            this.a = i2;
            this.b = i;
            if (i == 2) {
                this.i.c(this.o.I());
                this.k.setVisibility(0);
                o();
                if (i2 == 3) {
                    this.v.setAnimationListener(this.w);
                    this.e.startAnimation(this.v);
                    return;
                }
                this.e.setVisibility(8);
                k();
            } else if (i != 3) {
                this.k.setVisibility(8);
                n();
                o();
                this.e.setVisibility(8);
            } else {
                this.i.c(this.s.I());
                this.k.setVisibility(0);
                n();
                this.u.setAnimationListener(this.w);
                this.e.setVisibility(0);
                this.e.startAnimation(this.u);
            }
            a aVar = this.f;
            if (aVar == null) {
                return;
            }
            aVar.J(this.b);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar;
        if (view == null) {
            return;
        }
        if (view == this.k) {
            int i = this.b;
            if (i == 3) {
                m(2);
            } else if (i != 2) {
            } else {
                m(3);
            }
        } else if (view == this.l || view == this.m) {
            b bVar = this.g;
            if (bVar == null) {
                return;
            }
            bVar.i();
            this.i.a(this.o.I());
        } else if (view != this.d || (aVar = this.h) == null) {
        } else {
            aVar.g();
            this.i.a(this.d.d.I());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void pF(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        SubscriptionNotificationButton subscriptionNotificationButton = this.t;
        subscriptionNotificationButton.f = subscriptionNotificationMenuData;
        subscriptionNotificationButton.setOnClickListener(subscriptionNotificationButton);
        subscriptionNotificationButton.c.c();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.h = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        SubscribeButton subscribeButton = this.d;
        subscribeButton.e = subscribeButtonData.a();
        subscribeButton.b = subscribeButtonData.d();
        subscribeButton.c = subscribeButtonData.c();
        subscribeButton.d = subscribeButtonData.b();
        subscribeButton.a();
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.d dVar = subscribeButton.f;
        if (dVar != null) {
            ((d) dVar).b();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.t.b = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        SubscriptionNotificationButton subscriptionNotificationButton = this.t;
        subscriptionNotificationButton.e = subscriptionNotificationButtonData;
        subscriptionNotificationButton.setContentDescription(subscriptionNotificationButtonData.d());
        int a = subscriptionNotificationButtonData.a();
        subscriptionNotificationButton.setImageDrawable(a != 1 ? a != 2 ? a != 3 ? null : subscriptionNotificationButton.getResources().getDrawable(2131232336) : subscriptionNotificationButton.getResources().getDrawable(2131232340) : subscriptionNotificationButton.getResources().getDrawable(2131232339));
        subscriptionNotificationButton.c.c();
    }
}
