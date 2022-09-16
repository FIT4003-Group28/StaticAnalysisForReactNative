package defpackage;
/* compiled from: PG */
/* renamed from: ynn  reason: default package */
/* loaded from: classes4.dex */
final class ynn implements yng {
    @Override // defpackage.yng
    public final ynk[] a(Object obj, Class cls, Object obj2) {
        if (!(obj instanceof ynl)) {
            return null;
        }
        ynl ynlVar = (ynl) obj;
        Class[] ky = ynlVar.ky(cls, null, -1);
        if (ky != null) {
            ynm ynmVar = new ynm(ynlVar, cls, ky);
            ynk[] ynkVarArr = new ynk[ky.length];
            for (int i = 0; i < ky.length; i++) {
                ynkVarArr[i] = new ynk(obj, ky[i], obj2, ynmVar);
            }
            return ynkVarArr;
        }
        throw new IllegalArgumentException(String.format("Class %s does not contain any injected methods annotated with @Subscribe", cls.getSimpleName()));
    }
}
