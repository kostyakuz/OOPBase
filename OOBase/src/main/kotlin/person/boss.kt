package person

class boss(bossDamage: Int): Enemy(bossDamage) {
    override fun doDamage(target:BasePerson){
        super.doDamage(target)
        if (target is Nikolai){
            target.destroy()
        }

    }
}