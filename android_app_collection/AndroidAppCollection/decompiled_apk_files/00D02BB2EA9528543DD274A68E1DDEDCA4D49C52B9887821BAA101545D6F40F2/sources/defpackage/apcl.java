package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: apcl  reason: default package */
/* loaded from: classes2.dex */
public final class apcl {
    public final aoxv a;
    public final cjqy b;
    private final Activity c;
    private final bwqv d;
    private final cjqq e;

    public apcl(Activity activity, bwqv bwqvVar, aoxv aoxvVar, cjqq cjqqVar, cjqy cjqyVar) {
        this.c = activity;
        this.d = bwqvVar;
        this.a = aoxvVar;
        this.e = cjqqVar;
        this.b = cjqyVar;
    }

    public final void a(bwrs<aoyg> bwrsVar) {
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        if (c.b() != aoyf.PARTIALLY_LOADED || !c.d().isEmpty()) {
            return;
        }
        this.a.c(bwrsVar);
    }

    public final void b(bwrs<aoyg> bwrsVar, gga ggaVar) {
        dafk b = ckos.b(ggaVar.findViewById(16908290), R.string.MAPS_ACTIVITY_TIMELINE_ERROR_LOADING_PLACE_LIST, -2);
        b.p(ggaVar.getString(R.string.GENERIC_TRY_AGAIN), new apck(this, bwrsVar));
        b.c();
    }

    public final void c(int i, final DialogInterface.OnClickListener onClickListener) {
        final cjtd a = cjtd.a(dtyi.aO);
        final cjql d = this.e.g().d(a);
        final cjtd a2 = cjtd.a(dtyi.aM);
        final cjql d2 = this.e.g().d(a2);
        AlertDialog.Builder title = new AlertDialog.Builder(this.c, true != iva.a().booleanValue() ? R.style.MapsActivityAlertDialog : R.style.MapsActivityAlertDialogDarkMode).setTitle(this.c.getResources().getQuantityString(R.plurals.MAPS_ACTIVITY_REMOVE_ALL_PLACE_VISITS_TITLE, i, Integer.valueOf(i)));
        String string = this.c.getString(R.string.MAPS_ACTIVITY_REMOVE_ALL_PLACE_VISITS_LEARN_MORE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.c.getResources().getQuantityString(R.plurals.MAPS_ACTIVITY_REMOVE_ALL_PLACE_VISITS_CONFIRM, i, string));
        URLSpan uRLSpan = new URLSpan(String.format("https://support.google.com/accounts/answer/3118687?hl=%s", Locale.getDefault().getLanguage()));
        int indexOf = spannableStringBuilder.toString().indexOf(string);
        spannableStringBuilder.setSpan(uRLSpan, indexOf, string.length() + indexOf, 33);
        AlertDialog show = title.setMessage(spannableStringBuilder).setPositiveButton(R.string.REMOVE, new DialogInterface.OnClickListener(this, d, a, onClickListener) { // from class: apci
            private final apcl a;
            private final cjql b;
            private final cjtd c;
            private final DialogInterface.OnClickListener d;

            {
                this.a = this;
                this.b = d;
                this.c = a;
                this.d = onClickListener;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                apcl apclVar = this.a;
                cjql cjqlVar = this.b;
                cjtd cjtdVar = this.c;
                DialogInterface.OnClickListener onClickListener2 = this.d;
                apclVar.b.j(cjqlVar, cjtdVar);
                onClickListener2.onClick(dialogInterface, i2);
            }
        }).setNegativeButton(R.string.CANCEL_BUTTON, new DialogInterface.OnClickListener(this, d2, a2) { // from class: apcj
            private final apcl a;
            private final cjql b;
            private final cjtd c;

            {
                this.a = this;
                this.b = d2;
                this.c = a2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                apcl apclVar = this.a;
                apclVar.b.j(this.b, this.c);
            }
        }).show();
        TextView textView = (TextView) show.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            show.hide();
        }
    }

    public final void d(int i) {
        this.e.g().d(cjtd.a(dtyi.aQ));
        ckos.a(this.c.findViewById(16908290), this.c.getResources().getQuantityString(R.plurals.MAPS_ACTIVITY_REMOVE_PLACE_SUCCESS_TOAST_TEXT, i, Integer.valueOf(i)), 0).c();
    }

    public final void e(int i, View.OnClickListener onClickListener) {
        this.e.g().d(cjtd.a(dtyi.aP));
        dafk a = ckos.a(this.c.findViewById(16908290), this.c.getResources().getQuantityString(R.plurals.MAPS_ACTIVITY_REMOVE_VISIT_FAIL_TOAST_TEXT, i, Integer.valueOf(i)), 0);
        a.t(R.string.MAPS_ACTIVITY_REMOVE_VISIT_FAIL_TOAST_TRY_AGAIN_BUTTON, onClickListener);
        a.c();
    }

    public final bwrs<HashSet<akqi>> f(@dzsi Bundle bundle) {
        if (bundle != null) {
            try {
                bwrs<HashSet<akqi>> bwrsVar = (bwrs) this.d.d(bwrs.class, bundle, "removed_places_set_ref");
                if (bwrsVar != null) {
                    return bwrsVar;
                }
            } catch (IOException e) {
                bvoo.f(new IllegalStateException(e));
            }
        }
        return bwrs.a(new HashSet());
    }

    public final bwrs<aoyg> g(@dzsi Bundle bundle) {
        if (bundle != null) {
            try {
                bwrs<aoyg> bwrsVar = (bwrs) this.d.d(bwrs.class, bundle, "current_visited_places_list_ref");
                if (bwrsVar != null) {
                    return bwrsVar;
                }
            } catch (IOException e) {
                bvoo.f(new RuntimeException(e));
            }
        }
        return this.a.a(aoyj.f());
    }
}
