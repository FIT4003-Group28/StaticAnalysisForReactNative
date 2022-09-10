package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyqv  reason: default package */
/* loaded from: classes5.dex */
public final class cyqv extends bw {
    final /* synthetic */ cyqw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyqv(cyqw cyqwVar) {
        super(8, 9);
        this.c = cyqwVar;
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        cyph cyphVar = this.c.a;
        dbtp b = cyphVar == null ? null : cyphVar.b();
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidateContexts` (`candidate_id` TEXT NOT NULL, `context_id` TEXT NOT NULL, PRIMARY KEY(`candidate_id`, `context_id`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidates` (`id` TEXT NOT NULL, `proto_bytes` BLOB NOT NULL, PRIMARY KEY(`id`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidateInfo` (`candidate_id` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`candidate_id`))");
        avuVar.h("CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        cyph cyphVar2 = this.c.a;
        if (cyphVar2 == null || b == null) {
            return;
        }
        cypg.a(cyphVar2, 64, b, cyor.a);
    }
}
