package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deve  reason: default package */
/* loaded from: classes6.dex */
final class deve {
    public final SharedPreferences a;
    public final Executor e;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final String b = "topic_operation_queue";
    public final String c = ",";

    public deve(SharedPreferences sharedPreferences, Executor executor) {
        this.a = sharedPreferences;
        this.e = executor;
    }
}
