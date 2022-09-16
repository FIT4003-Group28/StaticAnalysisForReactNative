package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lab  reason: default package */
/* loaded from: classes3.dex */
public final class lab implements ajru {
    private final View a;
    private final /* synthetic */ int b;

    public lab(Context context, int i) {
        this.b = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.chip_divider_vertical, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return this.a;
        }
        return this.a;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }

    public lab(Context context, ViewGroup viewGroup) {
        this.a = LayoutInflater.from(context).inflate(R.layout.watch_card_horizontal_line, viewGroup, false);
    }

    public lab(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.account_switcher_loading, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        int i = this.b;
        if (i == 0) {
            laa laaVar = (laa) obj;
        } else if (i == 1) {
            apvl apvlVar = (apvl) obj;
        } else if (i == 2) {
            wep wepVar = (wep) obj;
        } else {
            akpq akpqVar = (akpq) obj;
        }
    }

    public lab(Context context, int i, char[] cArr) {
        this.b = i;
        this.a = View.inflate(context, R.layout.share_target_section_divider, null);
    }
}
