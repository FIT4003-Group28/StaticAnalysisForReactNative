package com.teslamotors.share;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.teslamotors.share.c;
/* compiled from: PopupDialog.java */
/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    ImageView f5443a;

    /* renamed from: b  reason: collision with root package name */
    ProgressBar f5444b;

    /* renamed from: c  reason: collision with root package name */
    TextView f5445c;

    /* renamed from: d  reason: collision with root package name */
    TextView f5446d;
    String e;
    int f;
    int g;
    Handler h = new Handler();
    Runnable i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PopupDialog.java */
    /* loaded from: classes.dex */
    public enum a {
        Alert,
        Error,
        Success,
        Processing,
        Timeout
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(FragmentManager fragmentManager, a aVar, String str, int i) {
        b bVar = (b) fragmentManager.findFragmentByTag("popup_dialog");
        if (bVar != null && bVar.isResumed()) {
            bVar.a(aVar.ordinal(), str, i);
            return;
        }
        b bVar2 = new b();
        Bundle bundle = new Bundle();
        bundle.putInt("type", aVar.ordinal());
        bundle.putString("msg", str);
        bundle.putInt("timeouts", i);
        bVar2.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.addToBackStack(null);
        bVar2.show(beginTransaction, "popup_dialog");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f = arguments.getInt("type");
        this.e = arguments.getString("msg");
        this.g = arguments.getInt("timeouts");
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(c.C0118c.share_popup, viewGroup);
        getDialog().requestWindowFeature(1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setStyle(2, 16973829);
        this.f5443a = (ImageView) inflate.findViewById(c.b.image);
        this.f5444b = (ProgressBar) inflate.findViewById(c.b.spinner);
        this.f5445c = (TextView) inflate.findViewById(c.b.title);
        this.f5446d = (TextView) inflate.findViewById(c.b.text);
        a(this.f, this.e, this.g);
        return inflate;
    }

    protected void a(int i, String str, int i2) {
        a(i);
        this.f5446d.setText(str);
        this.f5446d.setVisibility(str.equals("") ? 8 : 0);
        if (i2 != 0) {
            this.i = new Runnable() { // from class: com.teslamotors.share.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!b.this.isResumed() || b.this.isRemoving()) {
                        return;
                    }
                    b.this.dismiss();
                    b.this.getActivity().finish();
                    b.this.i = null;
                }
            };
            this.h.postDelayed(this.i, i2 * NetstatsParserPatterns.NEW_TS_TO_MILLIS);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.i != null) {
            this.h.removeCallbacks(this.i);
        }
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            getActivity().finish();
        }
    }

    @SuppressLint({"ConstantConditions"})
    private void a(int i) {
        if (i == a.Alert.ordinal()) {
            this.f5443a.setImageResource(c.a.ic_error);
            this.f5443a.setVisibility(0);
            this.f5444b.setVisibility(8);
            this.f5445c.setText(c.d.share_popup_title_info);
        } else if (i == a.Error.ordinal()) {
            this.f5443a.setImageResource(c.a.ic_error);
            this.f5443a.setVisibility(0);
            this.f5444b.setVisibility(8);
            this.f5445c.setText(c.d.share_popup_title_error);
        } else if (i == a.Success.ordinal()) {
            this.f5443a.setImageResource(c.a.ic_success);
            this.f5443a.setVisibility(0);
            this.f5444b.setVisibility(8);
            this.f5445c.setText(c.d.share_popup_title_success);
        } else if (i == a.Processing.ordinal()) {
            this.f5444b.setVisibility(0);
            this.f5443a.setVisibility(8);
            this.f5445c.setText(c.d.share_popup_title_sending);
        } else if (i != a.Timeout.ordinal()) {
        } else {
            this.f5443a.setImageResource(c.a.ic_error);
            this.f5443a.setVisibility(0);
            this.f5444b.setVisibility(8);
            this.f5445c.setText(c.d.share_popup_title_error);
        }
    }
}
