package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: akqn  reason: default package */
/* loaded from: classes.dex */
public final class akqn implements akqq {
    public final String a;
    public final File b;
    public final AtomicInteger c = new AtomicInteger(0);
    private final Executor d;
    private ankt e;

    public akqn(String str, Executor executor) {
        this.a = str;
        this.d = executor;
        this.b = new File(str);
        new akqk(this, 1);
    }

    public static void d(List list) {
        Process exec = Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()]));
        if (exec.waitFor() == 0) {
            return;
        }
        String str = new String(anek.c(exec.getErrorStream()));
        String valueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + str.length());
        sb.append("Could not execute ");
        sb.append(valueOf);
        sb.append(" because: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    @Override // defpackage.akqq
    public final ankt a(final akqe akqeVar, final akra akraVar) {
        return anii.h(anlz.v(new aniq() { // from class: akqm
            @Override // defpackage.aniq
            public final ankt a() {
                akqn akqnVar = akqn.this;
                akqe akqeVar2 = akqeVar;
                akqnVar.e();
                File file = new File(akqnVar.a, alwb.e(akqeVar2));
                if (!file.exists() || !file.canRead()) {
                    return anlz.q(null);
                }
                try {
                    return anlz.q(anhe.h(file));
                } catch (FileNotFoundException unused) {
                    return anlz.q(null);
                }
            }
        }, this.d), new ampg() { // from class: akqg
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                akqe akqeVar2 = akqe.this;
                akra akraVar2 = akraVar;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    String valueOf = String.valueOf(akqeVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb.append("Could not find any value for: ");
                    sb.append(valueOf);
                    throw new akqf(sb.toString());
                }
                try {
                    return akraVar2.a(bArr);
                } catch (IOException e) {
                    String valueOf2 = String.valueOf(akqeVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
                    sb2.append("An error occurred while unmarshalling the value for");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString(), e);
                }
            }
        }, anjk.a);
    }

    @Override // defpackage.akqq
    public final ankt b(final akqe akqeVar, final Object obj, final akqz akqzVar) {
        return anii.h(anlz.v(new aniq() { // from class: akqi
            @Override // defpackage.aniq
            public final ankt a() {
                return anlz.q(akqz.this.a(obj));
            }
        }, this.d), new ampg() { // from class: akqj
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                akqn akqnVar = akqn.this;
                akqe akqeVar2 = akqeVar;
                byte[] bArr = (byte[]) obj2;
                akqnVar.e();
                String str = akqnVar.a;
                int andIncrement = akqnVar.c.getAndIncrement();
                StringBuilder sb = new StringBuilder(15);
                sb.append(andIncrement);
                sb.append(".tmp");
                final File file = new File(str, sb.toString());
                try {
                    File file2 = new File(akqnVar.a, alwb.e(akqeVar2));
                    anhe.f(file);
                    anhc.d(bArr, file, amvn.q(new aner[]{aner.a}));
                    anhe.f(file2);
                    if (!file.exists()) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("mv");
                    arrayList.add(file.getAbsolutePath());
                    arrayList.add(file2.getAbsolutePath());
                    akqn.d(arrayList);
                    return null;
                } catch (IOException e) {
                    akqnVar.c(new amqo() { // from class: akql
                        @Override // defpackage.amqo
                        public final Object get() {
                            return amuk.r(file);
                        }
                    });
                    akqnVar.e();
                    String valueOf = String.valueOf(akqeVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb2.append("Unexpected error when writing the value for: ");
                    sb2.append(valueOf);
                    throw new RuntimeException(sb2.toString(), e);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    String valueOf2 = String.valueOf(akqeVar2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 60);
                    sb3.append("Unexpected error occurred while trying to persist data for: ");
                    sb3.append(valueOf2);
                    throw new RuntimeException(sb3.toString());
                }
            }
        }, anjk.a);
    }

    public final void c(final amqo amqoVar) {
        this.e = anlz.v(new aniq() { // from class: akqh
            @Override // defpackage.aniq
            public final ankt a() {
                List<File> list = (List) amqo.this.get();
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("rm");
                    arrayList.add("-r");
                    boolean z = false;
                    for (File file : list) {
                        if (file.exists()) {
                            arrayList.add(file.getAbsolutePath());
                            z = true;
                        }
                    }
                    if (z) {
                        akqn.d(arrayList);
                    }
                }
                return anlz.q(null);
            }
        }, this.d);
    }

    public final void e() {
        ankt anktVar = this.e;
        if (anktVar == null || anktVar.isDone()) {
            return;
        }
        try {
            this.e.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException unused2) {
        }
    }
}
