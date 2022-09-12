package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cdoy  reason: default package */
/* loaded from: classes4.dex */
public final class cdoy extends acl {
    public final Chip s;
    final /* synthetic */ cdoz t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoy(cdoz cdozVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chips_component_chip, viewGroup, false));
        this.t = cdozVar;
        this.s = (Chip) this.a;
    }
}
