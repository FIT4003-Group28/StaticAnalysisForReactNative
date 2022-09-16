package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajiw  reason: default package */
/* loaded from: classes.dex */
public final class ajiw extends ajin {
    public ajiw(Executor executor) {
        super(executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajin
    public final /* bridge */ /* synthetic */ aqtb a(Object obj) {
        aunb aunbVar = (aunb) obj;
        if (!aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            return null;
        }
        return (aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer);
    }
}
