package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaMeasureFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: czb  reason: default package */
/* loaded from: classes3.dex */
public class czb implements dap {
    public final int u;
    static final YogaMeasureFunction t = new dcj();
    private static final Map a = new HashMap();
    private static final AtomicInteger b = new AtomicInteger();

    public czb() {
        int intValue;
        Class<?> cls = getClass();
        Map map = a;
        synchronized (map) {
            if (!map.containsKey(cls)) {
                map.put(cls, Integer.valueOf(b.incrementAndGet()));
            }
            intValue = ((Integer) map.get(cls)).intValue();
        }
        this.u = intValue;
    }

    public static daq H(Class cls, cyv cyvVar, int i, Object[] objArr) {
        cyr cyrVar;
        daq daqVar;
        if (cyvVar == null || (cyrVar = cyvVar.f) == null) {
            czq.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            return dcs.d;
        }
        if (cls != cyrVar.getClass()) {
            String valueOf = String.valueOf(cyrVar.getClass().getSimpleName());
            czq.a(2, valueOf.length() != 0 ? "ComponentLifecycle:WrongContextForEventHandler:".concat(valueOf) : new String("ComponentLifecycle:WrongContextForEventHandler:"), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", cls.getSimpleName(), cyvVar.f.getClass().getSimpleName()));
        }
        cyr cyrVar2 = cyvVar.f;
        if (cyrVar2 == null) {
            czq.a(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            daqVar = dcs.d;
        } else {
            daqVar = new daq(cyrVar2, i, objArr);
        }
        ComponentTree componentTree = cyvVar.j;
        if (componentTree != null) {
            componentTree.B.c(cyvVar.f.m, daqVar);
        }
        return daqVar;
    }

    public static void N(cyv cyvVar, dao daoVar) {
        if (cyvVar.f != null) {
            return;
        }
        throw new RuntimeException("No component scope found for handler to throw error", daoVar.a);
    }

    public static void ak(Exception exc) {
        boolean z = dfz.a;
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }

    public static das an(cyv cyvVar, String str, int i) {
        cyr cyrVar = cyvVar.f;
        return new das(cyrVar == null ? "" : cyrVar.m, i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int D(int i, int i2) {
        return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int E() {
        return 0;
    }

    protected int F() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cyr G(cyv cyvVar, int i, int i2) {
        return cyl.a(cyvVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dcm I() {
        getClass().getSimpleName();
        return new daa(F());
    }

    public final Object J(Context context) {
        return L(context);
    }

    @Override // defpackage.dap
    public Object K(daq daqVar, Object obj) {
        boolean z = dfz.a;
        return null;
    }

    protected Object L(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(cyv cyvVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(cyv cyvVar, Object obj) {
        cyvVar.e = "mount";
        try {
            S(cyvVar, obj);
        } catch (Exception e) {
            cyvVar.f();
            ak(e);
        }
        cyvVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P(cyv cyvVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(cyv cyvVar, cyz cyzVar) {
    }

    public void R(cyv cyvVar, cyz cyzVar, int i, int i2, ddj ddjVar) {
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
        sb.append("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    protected void S(cyv cyvVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T(View view, mh mhVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(mh mhVar, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V(cyv cyvVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W(cyv cyvVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X(ddl ddlVar, ddl ddlVar2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Y() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean Z() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aa() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ab() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ac() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean ad() {
        return false;
    }

    public boolean ae() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean af() {
        return false;
    }

    protected boolean ag() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ah(cyr cyrVar, cyr cyrVar2) {
        if (ag()) {
            return ai(cyrVar, cyrVar2);
        }
        return true;
    }

    protected boolean ai(cyr cyrVar, cyr cyrVar2) {
        return !cyrVar.f(cyrVar2);
    }

    public int aj() {
        return 1;
    }

    public void al() {
    }

    public void am() {
    }

    public void ao() {
    }

    public void ap() {
    }

    public void aq() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ar() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void as(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aflw at(cyv cyvVar, aflw aflwVar) {
        return aflwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void au(aflw aflwVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cyr b(cyv cyvVar) {
        return cyl.a(cyvVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cyz c(cyv cyvVar) {
        return dbm.c(cyvVar, (cyr) this, false);
    }
}
