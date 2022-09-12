package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: ckrc  reason: default package */
/* loaded from: classes4.dex */
public abstract class ckrc implements ckrb {
    protected final ckra a;
    protected final ckrh b;
    private final dxio<cref> c;
    private final crem d;
    private final List<Integer> e = Arrays.asList(Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_1), Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_2), Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_3), Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_4), Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_5), Integer.valueOf((int) R.string.VOICE_ACTION_GENERAL_FAILURE_MESSAGE_6));

    public ckrc(ckra ckraVar, dxio<cref> dxioVar, crem cremVar, ckrh ckrhVar) {
        this.a = ckraVar;
        this.c = dxioVar;
        this.d = cremVar;
        this.b = ckrhVar;
    }

    private final void s(boolean z) {
        if (z) {
            this.a.d();
        }
    }

    public abstract void a(boolean z);

    public abstract int b(boolean z);

    public abstract int c();

    public abstract void d();

    public abstract int e();

    public abstract void f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    protected abstract int o(afia afiaVar);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ckrb
    public final void p(afia afiaVar) {
        int b;
        bvrj.UI_THREAD.c();
        dmcf dmcfVar = afiaVar.B;
        boolean z = afiaVar.D;
        if (dmcfVar == null || dmcfVar == dmcf.SEND_FEEDBACK || dmcfVar == dmcf.ACCEPT_SUGGESTION || dmcfVar == dmcf.DECLINE_SUGGESTION || dmcfVar == dmcf.SHOW_NEXT_TURN || dmcfVar == dmcf.SHOW_DESTINATION) {
            return;
        }
        crej crejVar = crej.RESPONSE;
        int ordinal = dmcfVar.ordinal();
        int i = R.string.DA_SPEECH_UNMUTE_CONFIRMATION;
        boolean z2 = false;
        switch (ordinal) {
            case 1:
                if (this.d.e() != cren.MUTED) {
                    this.d.i(cren.MUTED);
                    this.b.d(1);
                } else {
                    this.b.d(2);
                }
                i = R.string.DA_SPEECH_MUTE_CONFIRMATION;
                break;
            case 2:
                if (this.d.e() != cren.UNMUTED) {
                    this.d.i(cren.UNMUTED);
                    this.b.e(1);
                    break;
                } else {
                    this.b.e(2);
                    break;
                }
            case 3:
            case 22:
                b = b(true);
                if (!this.a.a()) {
                    if (b == -1) {
                        this.b.b(5);
                        b = q();
                    } else {
                        this.b.b(2);
                    }
                    i = b;
                    break;
                } else {
                    ckra ckraVar = this.a;
                    if (b != -1) {
                        z2 = true;
                    }
                    ckraVar.j(z2);
                    i = -1;
                    break;
                }
            case 4:
                i = b(false);
                break;
            case 5:
                a(true);
                i = -1;
                break;
            case 6:
                a(false);
                i = -1;
                break;
            case 7:
                b = c();
                if (true != this.e.contains(Integer.valueOf(b))) {
                    i = R.string.DA_SPEECH_ALTERNATES_CONFIRMATION;
                    break;
                }
                i = b;
                break;
            case 8:
                i = c();
                break;
            case 9:
                i = e();
                crejVar = crej.RESPONSE_KEEP_PLAYING_ON_STOP_NAVIGATION;
                break;
            case 10:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                i = -1;
                break;
            case 11:
            case 12:
            case 13:
                this.a.e();
                i = -1;
                break;
            case 14:
                this.a.f();
                i = -1;
                break;
            case 15:
                this.a.h();
                i = -1;
                break;
            case 16:
                this.a.g();
                i = -1;
                break;
            case 17:
                d();
                i = -1;
                break;
            case 18:
                i = i();
                break;
            case 19:
                f();
                i = -1;
                break;
            case 20:
                i = j();
                break;
            case 21:
                this.a.i();
                i = -1;
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            default:
                s(z);
                i = -1;
                break;
            case 27:
                this.a.l();
                i = -1;
                break;
            case 28:
                k();
                i = -1;
                break;
            case 29:
                this.a.m();
                i = -1;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                l();
                i = -1;
                break;
            case 35:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                i = this.a.n(dmcfVar);
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                i = o(afiaVar);
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                i = g();
                crejVar = crej.RESPONSE_KEEP_PLAYING_ON_STOP_NAVIGATION;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                i = h();
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_colorAccent /* 50 */:
                ((ckco) this.b.a.a(ckhi.au)).a(3);
                s(z);
                i = -1;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                m();
                i = -1;
                break;
            case com.google.android.filament.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                n();
                i = -1;
                break;
        }
        if (!z || i == -1) {
            return;
        }
        this.c.a().b(this.c.a().q().e(i), crejVar, this.b.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int q() {
        return this.e.get(new Random().nextInt(this.e.size())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i) {
        ((ckco) this.b.a.a(ckhi.ae)).a(i - 1);
    }
}
