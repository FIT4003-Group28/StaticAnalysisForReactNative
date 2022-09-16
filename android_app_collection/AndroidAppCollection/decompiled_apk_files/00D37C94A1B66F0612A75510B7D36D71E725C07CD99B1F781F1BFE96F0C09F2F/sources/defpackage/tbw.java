package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: tbw  reason: default package */
/* loaded from: classes4.dex */
public final class tbw implements tfa {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final tdb d;
    public final String e;
    public final String f;
    public final Context g;
    public final Handler h;
    private final ScheduledExecutorService j;
    private boolean k;

    public tbw(tdb tdbVar, String str, Context context) {
        DesugarCollections.synchronizedMap(new HashMap());
        this.h = new Handler(Looper.getMainLooper());
        this.e = "http";
        this.f = str;
        this.d = tdbVar;
        this.j = Executors.newSingleThreadScheduledExecutor();
        this.g = context;
    }

    private final synchronized void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.scheduleAtFixedRate(new Runnable() { // from class: tbu
            @Override // java.lang.Runnable
            public final void run() {
                tbw tbwVar = tbw.this;
                try {
                    aopa createBuilder = awnv.a.createBuilder();
                    HashSet<String> hashSet = new HashSet();
                    hashSet.addAll(tbwVar.a.keySet());
                    hashSet.addAll(tbwVar.b.keySet());
                    for (String str : hashSet) {
                        aopa createBuilder2 = awnw.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        awnw awnwVar = (awnw) createBuilder2.instance;
                        str.getClass();
                        awnwVar.b = 1 | awnwVar.b;
                        awnwVar.c = str;
                        if (tbwVar.c.containsKey(str)) {
                            String str2 = (String) tbwVar.c.get(str);
                            createBuilder2.copyOnWrite();
                            awnw awnwVar2 = (awnw) createBuilder2.instance;
                            str2.getClass();
                            awnwVar2.b = 2 | awnwVar2.b;
                            awnwVar2.d = str2;
                        }
                        createBuilder.copyOnWrite();
                        awnv awnvVar = (awnv) createBuilder.instance;
                        awnw awnwVar3 = (awnw) createBuilder2.mo39build();
                        awnwVar3.getClass();
                        aopu aopuVar = awnvVar.b;
                        if (!aopuVar.c()) {
                            awnvVar.b = aopi.mutableCopy(aopuVar);
                        }
                        awnvVar.b.add(awnwVar3);
                    }
                    byte[] byteArray = ((awnv) createBuilder.mo39build()).toByteArray();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(tbwVar.e, tbwVar.f, 5000, "/stateless_manifest").openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(byteArray);
                    bufferedOutputStream.close();
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] c = anek.c(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        httpURLConnection.disconnect();
                        awns awnsVar = (awns) aopi.parseFrom(awns.a, c);
                        for (awnt awntVar : awnsVar.b) {
                            String str3 = awntVar.b;
                            tbwVar.c.put(str3, awntVar.e);
                            int D = awwc.D(awntVar.d);
                            if (D == 0) {
                                D = 1;
                            }
                            int i = D - 1;
                            if (i == 1) {
                                tbwVar.a.put(str3, awntVar.c.I());
                            } else if (i == 2) {
                                awntVar.c.I();
                            }
                            int D2 = awwc.D(awntVar.d);
                            if (D2 != 0 && D2 == 2) {
                                String valueOf = String.valueOf(str3);
                                tbwVar.d.b(valueOf.length() != 0 ? "/system/template/".concat(valueOf) : new String("/system/template/"), awntVar.c.I());
                            }
                        }
                        final Context context = tbwVar.g;
                        for (awnu awnuVar : awnsVar.c) {
                            final String str4 = awnuVar.b;
                            final String str5 = awnuVar.c;
                            tbwVar.h.post(new Runnable() { // from class: tbt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context2 = context;
                                    String str6 = str4;
                                    String str7 = str5;
                                    String h = akzj.h(str6);
                                    StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 30 + String.valueOf(str7).length());
                                    sb.append("Elements Dev Server Error\n\n");
                                    sb.append(h);
                                    sb.append(" : ");
                                    sb.append(str7);
                                    Toast.makeText(context2, sb.toString(), 1).show();
                                }
                            });
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    Log.w("DevServerTemplateLoader", "Error talking to ElementsDevServer", e);
                }
            }
        }, 1L, 1L, TimeUnit.SECONDS);
    }

    public final byte[] a(String str) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = new URL(this.e, this.f, 5000, str).openConnection().getInputStream();
            try {
                byte[] c = anek.c(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return c;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    @Override // defpackage.tfa
    public final byte[] b(String str) {
        byte[] bArr;
        c();
        try {
            byte[] bArr2 = (byte[]) this.a.get(str);
            if (bArr2 != null) {
                return bArr2;
            }
            String valueOf = String.valueOf(str);
            final String concat = valueOf.length() != 0 ? "/template/".concat(valueOf) : new String("/template/");
            if (Looper.getMainLooper().isCurrentThread()) {
                try {
                    bArr = (byte[]) this.j.submit(new Callable() { // from class: tbv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return tbw.this.a(concat);
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IOException("Error talking to DevServer", e);
                }
            } else {
                bArr = a(concat);
            }
            this.a.put(str, bArr);
            return bArr;
        } catch (IOException e2) {
            Log.w("DevServerTemplateLoader", "Error talking to ElementsDevServer", e2);
            return null;
        }
    }
}
