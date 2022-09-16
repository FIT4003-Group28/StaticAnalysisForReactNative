package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.gmm.directions.appwidget.CreateDirectionsShortcutActivity;
import java.util.HashSet;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: qen  reason: default package */
/* loaded from: classes7.dex */
public final class qen implements View.OnClickListener {
    final /* synthetic */ CreateDirectionsShortcutActivity a;

    public qen(CreateDirectionsShortcutActivity createDirectionsShortcutActivity) {
        this.a = createDirectionsShortcutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity = this.a;
        cjql cjqlVar = createDirectionsShortcutActivity.F;
        if (cjqlVar != null) {
            createDirectionsShortcutActivity.y.n(cjqlVar, new cjte(deaf.TAP), cjtd.a(dtxn.dk));
        }
        CreateDirectionsShortcutActivity createDirectionsShortcutActivity2 = this.a;
        String trim = createDirectionsShortcutActivity2.l.getText().toString().trim();
        String trim2 = createDirectionsShortcutActivity2.k.getText().toString().trim();
        if (true == dbsj.d(trim)) {
            trim = trim2;
        }
        afhv afhvVar = (!createDirectionsShortcutActivity2.m.isChecked() || !createDirectionsShortcutActivity2.p() || !createDirectionsShortcutActivity2.o()) ? afhv.DEFAULT : afhv.NAVIGATION;
        HashSet hashSet = new HashSet();
        if (createDirectionsShortcutActivity2.o.isChecked()) {
            hashSet.add(afhq.AVOID_TOLLS);
        }
        if (createDirectionsShortcutActivity2.q.isChecked()) {
            hashSet.add(afhq.AVOID_HIGHWAYS);
        }
        if (createDirectionsShortcutActivity2.p.isChecked()) {
            hashSet.add(afhq.AVOID_FERRIES);
        }
        amvg amvgVar = new amvg();
        amvgVar.b = trim2;
        amvh a = amvgVar.a();
        Bitmap d = yzi.d(createDirectionsShortcutActivity2.n, createDirectionsShortcutActivity2);
        yzh yzhVar = new yzh(createDirectionsShortcutActivity2, dcdc.f(a));
        yzhVar.b = createDirectionsShortcutActivity2.n;
        yzhVar.c = hashSet;
        yzhVar.d = afhvVar;
        Intent a2 = yzhVar.a();
        if (a2 == null || d == null) {
            createDirectionsShortcutActivity2.setResult(0);
        } else {
            createDirectionsShortcutActivity2.setResult(-1, yzi.f(createDirectionsShortcutActivity2, String.format("directionsShortcut_%s", UUID.randomUUID()), trim, d, a2));
        }
        createDirectionsShortcutActivity2.finish();
    }
}
