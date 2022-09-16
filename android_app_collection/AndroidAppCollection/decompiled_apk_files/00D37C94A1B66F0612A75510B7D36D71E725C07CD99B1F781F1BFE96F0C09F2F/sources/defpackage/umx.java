package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: umx  reason: default package */
/* loaded from: classes4.dex */
public final class umx extends ow implements umi {
    public static final String ae = "umx";
    public final umj af = new umj(this);
    public uoc ag;
    public uoe ah;
    public AccountsModelUpdater ai;
    public Runnable aj;

    @Override // defpackage.dp
    public final void Z(final View view, Bundle bundle) {
        umj umjVar = this.af;
        Runnable runnable = new Runnable() { // from class: umu
            @Override // java.lang.Runnable
            public final void run() {
                zgd zgdVar;
                uky ukyVar;
                Class cls;
                Boolean bool;
                umd umdVar;
                umx umxVar = umx.this;
                View view2 = view;
                aqxo.q((umxVar.ag == null || umxVar.ah == null) ? false : true, "Post initialization code ran without being initialized");
                final ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) view2.findViewById(R.id.express_sign_in_modal);
                final uoc uocVar = umxVar.ag;
                final uoe uoeVar = umxVar.ah;
                expressSignInLayout.e = uocVar;
                final upq upqVar = uocVar.f;
                upqVar.e(expressSignInLayout);
                expressSignInLayout.a(upqVar);
                uok uokVar = uoeVar.a;
                expressSignInLayout.d = uokVar.g;
                if (uokVar.e.h()) {
                    uol uolVar = (uol) uokVar.e.c();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout = (FrameLayout) expressSignInLayout.findViewById(R.id.express_sign_in_header_logo_container);
                    Context context = expressSignInLayout.getContext();
                    ImageView imageView = new ImageView(context);
                    int i = true != wpn.b(context) ? R.drawable.googlelogo_light_color_74x24_vd : R.drawable.googlelogo_standard_color_74x24_vd;
                    aqxo.q(true, "An Activity Context is required to load Vector Drawables with SDK < LOLLIPOP");
                    imageView.setImageDrawable(po.b(context, i));
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.setVisibility(0);
                }
                final uog uogVar = (uog) uokVar.f.f();
                ampq ampqVar = uokVar.a;
                if (uogVar != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: une
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                            uog uogVar2 = uogVar;
                            expressSignInLayout2.e.f.d(tmd.a(), view3);
                            uogVar2.b.run();
                            expressSignInLayout2.d();
                        }
                    };
                    expressSignInLayout.o = new umo(uogVar.a);
                    expressSignInLayout.k.setOnClickListener(onClickListener);
                    expressSignInLayout.k.setVisibility(0);
                    expressSignInLayout.requestLayout();
                }
                ampq ampqVar2 = uokVar.b;
                ampq ampqVar3 = uokVar.c;
                if (expressSignInLayout.c) {
                    expressSignInLayout.f.setVisibility(8);
                }
                uoi uoiVar = (uoi) uokVar.d.f();
                if (uoiVar != null) {
                    expressSignInLayout.findViewById(R.id.esi_custom_header_container).setVisibility(0);
                    TextView textView = (TextView) expressSignInLayout.findViewById(R.id.esi_custom_header_subtitle);
                    ((TextView) expressSignInLayout.findViewById(R.id.esi_custom_header_title)).setText(uoiVar.a);
                    if (uoiVar.b.h()) {
                        textView.setText((CharSequence) uoiVar.b.c());
                    } else {
                        textView.setVisibility(8);
                    }
                }
                if (uokVar.e.h()) {
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.i.getLayoutParams()).topMargin = expressSignInLayout.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                    expressSignInLayout.i.requestLayout();
                    View findViewById = expressSignInLayout.findViewById(R.id.esi_custom_header_container);
                    ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = 0;
                    findViewById.requestLayout();
                }
                ampq ampqVar4 = uokVar.a;
                if (uokVar.f.h()) {
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.i.getLayoutParams()).bottomMargin = 0;
                    expressSignInLayout.i.requestLayout();
                    ((ViewGroup.MarginLayoutParams) expressSignInLayout.j.getLayoutParams()).bottomMargin = 0;
                    expressSignInLayout.j.requestLayout();
                    ampq ampqVar5 = uokVar.b;
                    expressSignInLayout.findViewById(R.id.disclaimer_separator).setVisibility(8);
                    expressSignInLayout.findViewById(R.id.footer_bottom_padding).setVisibility(0);
                } else {
                    ampq ampqVar6 = uokVar.b;
                }
                expressSignInLayout.f.setOnClickListener(new View.OnClickListener() { // from class: ung
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                        upq upqVar2 = upqVar;
                        uoe uoeVar2 = uoeVar;
                        if (!expressSignInLayout2.b) {
                            ampq ampqVar7 = uoeVar2.a.c;
                            return;
                        }
                        upqVar2.d(tmd.a(), view3);
                        expressSignInLayout2.h(aouq.DID_CLOSE_CONTAINER_BY_CLICKING_SCRIM);
                        expressSignInLayout2.j(false);
                    }
                });
                SelectedAccountView selectedAccountView = expressSignInLayout.h;
                ujx ujxVar = uocVar.c;
                zgd zgdVar2 = uocVar.g.c;
                Class cls2 = uocVar.d;
                amon amonVar = amon.a;
                selectedAccountView.p = amonVar;
                selectedAccountView.i();
                selectedAccountView.n = new ukv(selectedAccountView, zgdVar2, amonVar, null, null, null);
                selectedAccountView.i.g(ujxVar, zgdVar2);
                selectedAccountView.o = false;
                selectedAccountView.j.setRotation(360.0f);
                unl unlVar = new unl(expressSignInLayout, uocVar);
                Context context2 = expressSignInLayout.getContext();
                uls ulsVar = new uls();
                Class cls3 = uocVar.d;
                if (cls3 != null) {
                    ulsVar.c = cls3;
                    zgd zgdVar3 = uocVar.g.c;
                    if (zgdVar3 == null) {
                        throw new NullPointerException("Null accountConverter");
                    }
                    ulsVar.f = zgdVar3;
                    uld uldVar = uocVar.b;
                    if (uldVar == null) {
                        throw new NullPointerException("Null accountsModel");
                    }
                    ulsVar.b = uldVar;
                    ulsVar.d = true;
                    ujx ujxVar2 = uocVar.c;
                    if (ujxVar2 == null) {
                        throw new NullPointerException("Null avatarImageLoader");
                    }
                    ulsVar.a = ujxVar2;
                    uox uoxVar = uocVar.e;
                    if (uoxVar == null) {
                        throw new NullPointerException("Null oneGoogleEventLogger");
                    }
                    ulsVar.e = uoxVar;
                    ujx ujxVar3 = ulsVar.a;
                    if (ujxVar3 == null || (zgdVar = ulsVar.f) == null || (ukyVar = ulsVar.b) == null || (cls = ulsVar.c) == null || (bool = ulsVar.d) == null || ulsVar.e == null) {
                        StringBuilder sb = new StringBuilder();
                        if (ulsVar.a == null) {
                            sb.append(" avatarImageLoader");
                        }
                        if (ulsVar.f == null) {
                            sb.append(" accountConverter");
                        }
                        if (ulsVar.b == null) {
                            sb.append(" accountsModel");
                        }
                        if (ulsVar.c == null) {
                            sb.append(" accountClass");
                        }
                        if (ulsVar.d == null) {
                            sb.append(" allowRings");
                        }
                        if (ulsVar.e == null) {
                            sb.append(" oneGoogleEventLogger");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    ult ultVar = new ult(ujxVar3, zgdVar, ukyVar, cls, bool.booleanValue(), ulsVar.e, null, null, null);
                    final uld uldVar2 = uocVar.b;
                    final uni uniVar = new uni(expressSignInLayout);
                    Context context3 = expressSignInLayout.getContext();
                    UserManager userManager = (UserManager) context3.getSystemService("user");
                    if (userManager == null || !userManager.hasUserRestriction("no_modify_accounts")) {
                        umc umcVar = new umc();
                        umcVar.a(R.id.og_ai_not_set);
                        umcVar.b(-1);
                        umcVar.a(R.id.og_ai_add_another_account);
                        Drawable b = po.b(context3, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
                        b.getClass();
                        umcVar.b = b;
                        String string = context3.getString(R.string.og_add_another_account);
                        if (string == null) {
                            throw new NullPointerException("Null label");
                        }
                        umcVar.c = string;
                        umcVar.e = new View.OnClickListener() { // from class: umb
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                uni uniVar2 = uni.this;
                                uldVar2.a();
                                ExpressSignInLayout expressSignInLayout2 = uniVar2.a;
                                expressSignInLayout2.i(view3);
                                expressSignInLayout2.j(false);
                            }
                        };
                        umcVar.b(90141);
                        Integer num = umcVar.a;
                        if (num == null) {
                            throw new IllegalStateException("Property \"id\" has not been set");
                        }
                        aqxo.z(num.intValue() != R.id.og_ai_not_set, "Did you forget to setId()?");
                        Integer num2 = umcVar.d;
                        if (num2 == null) {
                            throw new IllegalStateException("Property \"veId\" has not been set");
                        }
                        aqxo.z(num2.intValue() != -1, "Did you forget to setVeId()?");
                        Integer num3 = umcVar.a;
                        if (num3 == null || umcVar.b == null || umcVar.c == null || umcVar.d == null || umcVar.e == null) {
                            StringBuilder sb3 = new StringBuilder();
                            if (umcVar.a == null) {
                                sb3.append(" id");
                            }
                            if (umcVar.b == null) {
                                sb3.append(" icon");
                            }
                            if (umcVar.c == null) {
                                sb3.append(" label");
                            }
                            if (umcVar.d == null) {
                                sb3.append(" veId");
                            }
                            if (umcVar.e == null) {
                                sb3.append(" onClickListener");
                            }
                            String valueOf2 = String.valueOf(sb3);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                            sb4.append("Missing required properties:");
                            sb4.append(valueOf2);
                            throw new IllegalStateException(sb4.toString());
                        }
                        umdVar = new umd(num3.intValue(), umcVar.b, umcVar.c, umcVar.d.intValue(), umcVar.e);
                    } else {
                        umdVar = null;
                    }
                    ulr ulrVar = new ulr(context2, ultVar, new t(umdVar == null ? amuk.q() : amuk.r(umdVar)), unlVar, ExpressSignInLayout.c(), upqVar, expressSignInLayout.getResources().getDimensionPixelSize(R.dimen.og_express_sign_in_account_management_extra_horizontal_padding), amon.a, amon.a);
                    expressSignInLayout.e(ulrVar.b());
                    ulrVar.u(new unp(expressSignInLayout, ulrVar));
                    RecyclerView recyclerView = expressSignInLayout.g;
                    umm ummVar = new umm(recyclerView, ulrVar);
                    if (lj.aj(recyclerView)) {
                        ummVar.onViewAttachedToWindow(recyclerView);
                    }
                    recyclerView.addOnAttachStateChangeListener(ummVar);
                    expressSignInLayout.j.setOnClickListener(new View.OnClickListener() { // from class: unh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                            upq upqVar2 = upqVar;
                            uoe uoeVar2 = uoeVar;
                            uoc uocVar2 = uocVar;
                            upqVar2.d(tmd.a(), view3);
                            expressSignInLayout2.f(uoeVar2, uocVar2.b.a());
                        }
                    });
                    final unk unkVar = new unk(expressSignInLayout, uoeVar);
                    expressSignInLayout.i.setOnClickListener(new View.OnClickListener() { // from class: unf
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ExpressSignInLayout expressSignInLayout2 = ExpressSignInLayout.this;
                            upq upqVar2 = upqVar;
                            uoc uocVar2 = uocVar;
                            unk unkVar2 = unkVar;
                            upqVar2.d(tmd.a(), view3);
                            uocVar2.b.g = unkVar2;
                            expressSignInLayout2.i(view3);
                        }
                    });
                    unq unqVar = new unq(expressSignInLayout, uocVar, new ujw() { // from class: unj
                        @Override // defpackage.ujw
                        public final void a() {
                            ExpressSignInLayout.this.m();
                        }
                    });
                    expressSignInLayout.addOnAttachStateChangeListener(unqVar);
                    unr unrVar = new unr(expressSignInLayout);
                    expressSignInLayout.addOnAttachStateChangeListener(unrVar);
                    if (lj.aj(expressSignInLayout)) {
                        unqVar.onViewAttachedToWindow(expressSignInLayout);
                        unrVar.onViewAttachedToWindow(expressSignInLayout);
                    }
                    if (umxVar.ai == null) {
                        return;
                    }
                    uwp.f();
                    umxVar.L().getLifecycle().c(umxVar.ai);
                    return;
                }
                throw new NullPointerException("Null accountClass");
            }
        };
        uwp.f();
        umjVar.a.add(runnable);
        if (umjVar.b.b()) {
            umjVar.a();
        }
    }

    public final void aE() {
        dismiss();
        Runnable runnable = this.aj;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.umi
    public final boolean b() {
        return (this.ag == null || this.ah == null) ? false : true;
    }

    @Override // defpackage.dh
    public final void dismiss() {
        if (ap()) {
            if (as()) {
                super.ku();
            } else {
                super.dismiss();
            }
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Context rb = rb();
        rb.getClass();
        TypedValue typedValue = new TypedValue();
        mN(1, rb.getTheme().resolveAttribute(R.attr.expressSignInDialogStyle, typedValue, true) ? typedValue.resourceId : 2132083875);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.express_sign_in_dialog, viewGroup);
        ExpressSignInLayout expressSignInLayout = (ExpressSignInLayout) inflate.findViewById(R.id.express_sign_in_modal);
        expressSignInLayout.c = true;
        expressSignInLayout.p = new Runnable() { // from class: umt
            @Override // java.lang.Runnable
            public final void run() {
                umx.this.dismiss();
            }
        };
        inflate.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: ums
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                umx.this.aE();
            }
        });
        lj.M(expressSignInLayout, new umw(this));
        expressSignInLayout.findViewById(R.id.content_container).setOnTouchListener(gia.b);
        return inflate;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Runnable runnable = this.aj;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Context rb = rb();
        rb.getClass();
        return new umv(rb, this.b);
    }
}
