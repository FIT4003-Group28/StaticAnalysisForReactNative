package defpackage;

import com.google.android.apps.youtube.app.settings.accessibility.AccessibilityPrefsFragment;
/* compiled from: PG */
/* renamed from: lhx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lhx implements zcn {
    public final /* synthetic */ AccessibilityPrefsFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ lhx(AccessibilityPrefsFragment accessibilityPrefsFragment, int i) {
        this.b = i;
        this.a = accessibilityPrefsFragment;
    }

    @Override // defpackage.zcn
    public final void a(Object obj) {
        if (this.b == 0) {
            AccessibilityPrefsFragment accessibilityPrefsFragment = this.a;
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asiy.a.createBuilder();
            long b = babq.b((String) obj);
            createBuilder2.copyOnWrite();
            asiy asiyVar = (asiy) createBuilder2.instance;
            asiyVar.b = 1 | asiyVar.b;
            asiyVar.c = b;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asiy asiyVar2 = (asiy) createBuilder2.mo39build();
            asiyVar2.getClass();
            asjjVar.u = asiyVar2;
            asjjVar.c |= 2048;
            accessibilityPrefsFragment.e.oi().H(3, new acte(actj.ACCESSIBILITY_SETTINGS_CONTROLS_TIMEOUT_DIALOG), (asjj) createBuilder.mo39build());
            return;
        }
        AccessibilityPrefsFragment accessibilityPrefsFragment2 = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        accessibilityPrefsFragment2.c.G(booleanValue);
        aopa createBuilder3 = asjj.a.createBuilder();
        aopa createBuilder4 = asja.a.createBuilder();
        int i = true != booleanValue ? 3 : 2;
        createBuilder4.copyOnWrite();
        asja asjaVar = (asja) createBuilder4.instance;
        asjaVar.c = i - 1;
        asjaVar.b |= 1;
        createBuilder3.copyOnWrite();
        asjj asjjVar2 = (asjj) createBuilder3.instance;
        asja asjaVar2 = (asja) createBuilder4.mo39build();
        asjaVar2.getClass();
        asjjVar2.m = asjaVar2;
        asjjVar2.b |= 32768;
        accessibilityPrefsFragment2.e.oi().H(3, new acte(actj.ACCESSIBILITY_PLAYER_SETTINGS_TOGGLE_BUTTON), (asjj) createBuilder3.mo39build());
    }
}
