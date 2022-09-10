package defpackage;

import android.content.res.ColorStateList;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cvzx  reason: default package */
/* loaded from: classes5.dex */
public final class cvzx extends acl {
    public final cwif s;
    public final Chip t;
    public final TextView u;
    public final m v;
    public final cwee w;

    public cvzx(m mVar, cwee cweeVar, cwif cwifVar, cwie cwieVar) {
        super(cwifVar.a);
        this.v = mVar;
        this.w = cweeVar;
        this.s = cwifVar;
        Chip chip = (Chip) this.a.findViewById(R.id.og_highlight_chip);
        this.t = chip;
        this.u = (TextView) this.a.findViewById(R.id.count);
        cwia cwiaVar = (cwia) cwieVar;
        chip.setChipBackgroundColor(ColorStateList.valueOf(cwiaVar.c));
        chip.setTextColor(cwiaVar.d);
    }
}
