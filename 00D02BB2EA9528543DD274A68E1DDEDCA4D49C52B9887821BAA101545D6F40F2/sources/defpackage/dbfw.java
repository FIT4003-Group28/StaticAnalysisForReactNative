package defpackage;

import com.google.ar.sceneform.rendering.Material;
import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dbfw  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class dbfw implements Function {
    static final Function a = new dbfw();

    private dbfw() {
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Material) obj).a();
    }
}
