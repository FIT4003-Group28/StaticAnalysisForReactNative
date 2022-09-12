package defpackage;

import com.google.ar.sceneform.rendering.Material;
import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dbft  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class dbft implements Function {
    static final Function a = new dbft();

    private dbft() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Material) obj).a();
    }
}
