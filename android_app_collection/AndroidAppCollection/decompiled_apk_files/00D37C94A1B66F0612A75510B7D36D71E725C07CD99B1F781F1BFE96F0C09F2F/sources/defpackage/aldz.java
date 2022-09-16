package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: aldz  reason: default package */
/* loaded from: classes.dex */
public final class aldz extends aleo {
    private static final amuk a = amuk.v(1000L, 5000L, 30000L, 60000L, 300000L);
    private final aldn b;
    private final akze c;

    public aldz(aadd aaddVar, aldn aldnVar, akze akzeVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_CLEANUP, albfVar, akzeVar, alhtVar);
        this.b = aldnVar;
        this.c = akzeVar;
    }

    private final ankt s(alcw alcwVar, boolean z) {
        this.b.c();
        int i = 0;
        if ((alcwVar.c & 268435456) != 0) {
            File file = new File(alcwVar.aj);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        if (!file2.delete()) {
                            String.valueOf(String.valueOf(file2)).length();
                            i2 = 1;
                        }
                        i++;
                    }
                    i = i2;
                } else {
                    String.valueOf(String.valueOf(file)).length();
                    i = 1;
                }
                if (i == 0) {
                    i = !file.delete();
                }
            }
        }
        if (alcwVar.R.size() != 0) {
            for (String str : alcwVar.R) {
                File file3 = new File(str);
                if (file3.exists() && !file3.delete()) {
                    String.valueOf(String.valueOf(file3)).length();
                    i = 1;
                }
            }
        }
        if (i != 0) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_DELETION_FAILED;
            alct alctVar = alcwVar.ak;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            return anlz.q(t(alhtVar.d(avunVar, alctVar, a, this.c), z));
        }
        return anlz.q(t(this.d.e(), z));
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.ak;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        return s(alcwVar, true);
    }

    @Override // defpackage.algt
    public final ankt d(String str, akzp akzpVar) {
        try {
            alcw b = akzpVar.b(str);
            if (b == null) {
                return anlz.p(akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND));
            }
            return s(b, false);
        } catch (akzq e) {
            return anlz.p(e);
        }
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.j;
    }

    @Override // defpackage.algt
    public final String f() {
        return "CacheCleanupTask";
    }

    @Override // defpackage.aleo
    public final boolean g() {
        return true;
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        return true;
    }

    @Override // defpackage.algt
    public final boolean j() {
        return true;
    }
}
